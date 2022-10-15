package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6 {//Test Class
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB;//d
		
//		driver.navigate().refresh();
		
		unTB = driver.findElement(By.id("username"));//i
		
		driver.navigate().refresh();
		
		
		unTB.sendKeys("admin");//u
		
//		driver.navigate().refresh();
	}
}











