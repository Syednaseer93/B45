package day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
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
public class Demo2 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		File srcFile = unTB.getScreenshotAs(OutputType.FILE);
		File dstFile =new File("./img/unTB.png");
		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
		
	}

}
