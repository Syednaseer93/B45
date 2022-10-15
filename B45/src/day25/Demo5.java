package day25;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		ChromeOptions options = new ChromeOptions(); 

		String[] switchs={"enable-automation"}; 
		
		options.setExperimentalOption("excludeSwitches",switchs); 
				
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.makemytrip.com/");
	}


}
