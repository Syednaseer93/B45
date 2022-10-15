package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*Hidden Division popup - HTML popup
 * 1. we can inspect the popup
 * 2. we cant move the popup
 * 
 * How to handle HTML popup?
 * using findElement
 * 
 * When we try to click on an element departure we got ElementClickInterceptedException
 * So we used Thread.sleep, then it did not click on html popup, we got WebDriverException
 * after R&D , we removed Thread.sleep, used explicit wait - TimeOutException
 * 
 * finally - we remove both sleep & Explicit wait , we changed the xpath of the element
 * ( we clicked on parent element)
 * 
 * How do u handle calendar popup ?
 * it is a HTML popup we handle it using findElement only 
 * and we may also use dynamic xpath
 * 
 */
public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		
		String my="August 2022";
		String d="15";  
		
		WebDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");

		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='departure']/..")).click();
		
//		String xp2="//div[text()='July 2022']/../..//p[.='20']";
		
		String xp="//div[text()='"+my+"']/../..//p[.='"+d+"']";
		
		
		driver.findElement(By.xpath(xp)).click();
	}


}
