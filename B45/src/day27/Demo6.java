package day27;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
/*Handling Notification popup without changing browser settings
 * (by using Robot to type shortcuts)
 * 
 * 
 * 
 */
public class Demo6 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://pushalert.co/demo");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("send-button")).click();
		
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_B);			//A -> allow ; B -> block
 		r.keyRelease(KeyEvent.VK_ALT);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("send-button")).click();
		
		Thread.sleep(1000);
		
		String msg = driver.findElement(By.id("pa_class-blocked-info")).getText();
		
		System.out.println(msg);
		
		driver.quit();
	}
}
