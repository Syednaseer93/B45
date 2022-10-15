package day27;

import java.time.Duration;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
/*
 * How to hide the ribbon - Chrome is controlled by automation..
 * 
 */
public class Demo5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput","true");//Only local connections
		
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);//hide warnings
		
		ChromeOptions options=new ChromeOptions();
		
		String[] v={"enable-automation"};
		
		options.setExperimentalOption("excludeSwitches", v);//hide the ribbon
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://www.google.com");
		
	}
}
