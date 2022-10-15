package day36;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Parameters({"browser","hub"})
	@Test
	public void testA(@Optional("chrome") String browser,String hub) throws InterruptedException, MalformedURLException
	{
		WebDriver driver;
		
		Reporter.log("Browser is:"+browser,true);
		URL  url=new URL(hub);
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName(browser);
		driver=new RemoteWebDriver(url, dc);
		
		if(browser.equals("chrome"))
		{

			driver.manage().window().setPosition(new Point(750,10));
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
