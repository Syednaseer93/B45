package day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Write a script to close Akshara browser
 * 
 * 
 */

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///F:/B45/Demo9.html");
		
		driver.findElement(By.id("A5")).click();
		
		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();
		
		
		for(String wh:allWHS) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.equals("Akshara")) {
				driver.close();
				break;
			}
		}
		

		
	}


}
