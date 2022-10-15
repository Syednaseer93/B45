package day27;

import java.time.Duration;
import java.util.HashMap;

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
public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		
		String[] v=new String[1];
		v[0]="enable-automation";
		
		options.setExperimentalOption("excludeSwitches", v);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://www.google.com");
		
	}
}
