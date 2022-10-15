package day15;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*To take the screenshot of the element we can use getScreenshotAs method of WebElement
 * format of the image- png (Portable Network Graphics)
 * after the execution screenshot will be deleted automatically
 * hence we should copy paste the screenshot from temp folder to req location
 * 
 */
public class Demo1 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		File a = unTB.getScreenshotAs(OutputType.FILE);
		String location = a.getAbsolutePath();
		System.out.println(location);
		Thread.sleep(15000);//30sec
		driver.quit();
		
	}

}
