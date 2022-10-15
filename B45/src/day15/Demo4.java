package day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

/*
 * Taking the screenshot of complete page 
 * 1. we can take screen shot of an element / area/ visible area of page
 * 2. Not possible- Desktop screenshot , hidden section of the page
 *  
 * 
 */
public class Demo4 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();//up casting
		driver.get("https://www.actitime.com/");
		Shutterbug.shootPage(driver,Capture.FULL,true).save("./img/");
		driver.quit();
		
	}

}
