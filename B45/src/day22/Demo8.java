package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*Print the content of list box in sorted order
 * 
 */
public class Demo8 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo7.html");

		WebElement listBox = driver.findElement(By.id("A2")); 

		Select select=new Select(listBox);
		
		List<WebElement> allOptions = select.getOptions();
		
		List<String> allText=new ArrayList<String>(); 
		
		for(WebElement option:allOptions) 
		{
		
			String text=option.getText();
			allText.add(text);
		
		}
		
		
		System.out.println(allText);
		
		Collections.sort(allText);
		
		System.out.println(allText);
		
	
		driver.quit();
		
	}


}
