package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Demo2 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.id("username")).sendKeys("admin");  // one statement
		
//		WebElement unTB = driver.findElement(By.id("username")); //2
//		
//		unTB.sendKeys("admin");
		
		//3
		WebElement unTB;//d
		
		unTB = driver.findElement(By.id("username"));//i
		
		unTB.sendKeys("admin");//u
		
	}
}
