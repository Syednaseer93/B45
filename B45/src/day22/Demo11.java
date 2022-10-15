package day22;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//verify whether listbox contains any duplicate options
public class Demo11 {
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

				Integer count = items.get(city);
				count++;
				items.put(city,count);
			}
			else
			{
				items.put(city,1);
			}
  
		}
		
		Set<String> allCity = items.keySet();
		
		for(String city:allCity)
		{
			int count=items.get(city);
			if(count==1)
			{
				
				System.out.println(city);
			}
		}
		driver.quit();
		

		
	}

}
