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

public class Demo5 {

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
			if(cityPresent)
			{
				//city is already present , hence get its current count 
				Integer count = items.get(city);
				count++;//add +1 and put it back to map
				items.put(city,count);
			}
			else
			{
				//city is not present and we are adding it for the 1s time
				items.put(city,1);
			}
  
		}
		//print items present in list box with their occurance 
		System.out.println(items); //{A=2,B=1,C=1}
		
		//print items present in list box with repeating it
		System.err.println(items.keySet());
		
		//print only duplicate items
		for(String key:items.keySet()) {
			int count= items.get(key);
			if(count>1) {
				System.out.println(key);
			}
		}
		
		//print only uneque items
		for(String key:items.keySet()) {
			int count= items.get(key);
			if(count==1) {
				System.out.println(key);
			}
		}
		
		driver.quit();
		
		
	}


}
