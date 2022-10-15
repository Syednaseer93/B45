package day35;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
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

public class Demo2 {
	
	
	@Test
	public void testA() throws InterruptedException, MalformedURLException
	{
		//details of remote system to connect
		URL url=new URL("");
		
		//which browser to use in remote system
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.LINUX);
		//open the browser in remote system
		WebDriver driver=new RemoteWebDriver(url, dc);
		
			
		driver.get("https://demo.actitime.com/login.do");
		
		for(int i=1;i<=2;i++) {
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(500);
			driver.findElement(By.id("username")).clear();
			Thread.sleep(500);
		}
		
		driver.quit();
	}
}
