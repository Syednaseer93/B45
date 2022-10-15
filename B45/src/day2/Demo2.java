package day2;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2 {

	public static void main(String[] args) {
		TakesScreenshot t;
		InternetExplorerDriver i;
		EdgeDriver e;
		ChromiumDriver c;
		RemoteWebDriver r;
		//set the path of driver executable
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		//Open the chrome browser
		FirefoxDriver driver=new FirefoxDriver();
		
			
		//enter the URL
		driver.get("http://www.google.com");
		

	}

}
