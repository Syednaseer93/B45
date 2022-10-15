package day23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo8.html");

		WebElement listBox = driver.findElement(By.id("A1")); 

		Select select=new Select(listBox);
		
		List<WebElement> allOptions = select.getOptions();
		
		LinkedHashMap<String, Integer> items=new LinkedHashMap<String, Integer>();
		
		for(WebElement option:allOptions) {
			
			String city=option.getText();
			
			boolean cityPresent = items.containsKey(city);
			System.out.println(cityPresent);         
			
			items.put(city,1);
			
  
		}
		
		System.out.println(items);
		
		driver.quit();
		
		
	}


}
