package day45;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class demo2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(new URL("http://43.204.24.107:4444/wd/hub"),dc);
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(8000);
		driver.quit();
	}
}
