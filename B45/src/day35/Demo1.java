package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	@Parameters("browser")
	@Test
	public void testA(@Optional("chrome") String browser) throws InterruptedException
	{
		WebDriver driver;
		
		Reporter.log("Browser is:"+browser,true);
		
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().setPosition(new Point(750,10));
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().setSize(new Dimension(550,550));
		driver.get("https://demo.actitime.com/login.do");
		
		for(int i=1;i<=20;i++) {
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(500);
			driver.findElement(By.id("username")).clear();
			Thread.sleep(500);
		}
		
		driver.quit();
	}
}
