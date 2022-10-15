package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class DemoPage
{
	private WebElement unTB;//d
	
	DemoPage(WebDriver driver)
	{
		unTB = driver.findElement(By.id("username"));//i
	}
	
	void setUserName()
	{
		unTB.sendKeys("admin");//u
	}
}
public class Demo3 {
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		
	
		WebDriver driver=new FirefoxDriver();
			
		driver.get("https://demo.actitime.com/login.do");
		
		DemoPage d=new DemoPage(driver);
		d.setUserName();
		
	}
}
