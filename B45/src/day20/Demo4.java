package day20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Write a generic code to select required auto suggestion without using looping statements
 * 
 * 
 * 
 */
public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void selectAutoSuggestion(WebDriver driver,String xp, int index) 
	{
		List<WebElement> allASE = driver.findElements(By.xpath(xp));
		allASE.get(index).click();
	}
	public static void selectAutoSuggestion(WebDriver driver,String text) {
		String xp="//span[.='"+text+"']";
		driver.findElement(By.xpath(xp)).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");				
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		String xp="//span[starts-with(text(),'selenium')]";
		Demo4.selectAutoSuggestion(driver,xp,3);
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");	
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1000);
		Demo4.selectAutoSuggestion(driver,"selenium ide");
	}

}
