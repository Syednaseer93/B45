package day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Taking the screenshot of page section
 */
public class Demo3 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement box = driver.findElement(By.id("whiteBoxWithLogo"));
		File srcFile = box.getScreenshotAs(OutputType.FILE);
		File dstFile =new File("./img/box.png");
		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
		
	}

}
