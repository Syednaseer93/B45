package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Hidden Division popup - HTML popup
 * 1. we can inspect the popup
 * 2. we cant move the popup
 * 
 * How to handle HTML popup?
 * using findElement
 */
public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().activeElement().sendKeys("javagalbhanu@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akshara");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
	}


}
