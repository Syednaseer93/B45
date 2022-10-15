package day35;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class Demo4 {

	@Test
	public void testA() throws MalformedURLException
	{


		URL url=new URL("https://oauth-chaitanya.rymec72-acdb2:1176c6e4-9c44-42e4-97c4-42e8d80e0bb9@ondemand.eu-central-1.saucelabs.com:443/wd/hub");

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");

		WebDriver driver=new RemoteWebDriver(url, dc);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}
}
