package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Demo2 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxOptions options=new FirefoxOptions();
		//1-allow    2 -block
		options.addPreference("permissions.default.desktop-notification",2);
		
		WebDriver driver=new FirefoxDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://pushalert.co/demo");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("send-button")).click();
		
		String msg = driver.findElement(By.id("pa_class-blocked-info")).getText();
		
		System.out.println(msg);
		
		driver.quit();
	}
}
