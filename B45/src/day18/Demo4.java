package day18;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Selenium is fast & application is slow --- we get NSEE
 * Synchronization- process of matching selenium speed with application
 * options: 
 * 1. Thread.sleep- by Java - Blind wait
 * 2. Implicit wait - By Selenium
 * Note: in Selenium 4 argument is changed to Duration (it was long and TimeUnit)
 * and getter methods has been added
 * deprecated - no longer supported
 * 
 * We need to set  implicitlyWait only once at the beginning of the script
 * implicitlyWait is used only for findElement and findElements methods
 * implicitlyWait time is applicable for all  findElement and findElements methods 
 * and not just for one method
 * 
 */
public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//selenium 3
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium 4
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Hi");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("logoutLink")).click();
		
		
	}

}
