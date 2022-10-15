package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*Write a script to select all the options in MSLB
 * and deselect all the options without using deselectAll()
 */
public class Demo6 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo7.html");

		WebElement listBox = driver.findElement(By.id("A2")); 

		Select select=new Select(listBox);
		int count = select.getOptions().size();
		for(int i=0;i<count;i++) {
			select.selectByIndex(i);
			Thread.sleep(500);
		}
		
		for(int i=count-1;i>=0;i--) {
			select.deselectByIndex(i);
			Thread.sleep(500);
		}
//		driver.quit();
	}


}
