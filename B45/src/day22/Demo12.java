package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*ListBox content is sorted or not
 * 
 */
public class Demo12 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo7.html");

		WebElement listBox = driver.findElement(By.id("A2")); 

		Select select=new Select(listBox);
		
		List<WebElement> allOptions = select.getOptions();
		
		List<String> beforeSorting=new ArrayList<String>(); 
		
		for(WebElement option:allOptions) 
		{
		
			String text=option.getText();
			beforeSorting.add(text);
		
		}
		
		
		List<String> afterSorting=new ArrayList<String>(beforeSorting); 
		Collections.sort(afterSorting);
		
		System.out.println(beforeSorting);
		
		System.out.println(afterSorting);
		
		if(beforeSorting.equals(afterSorting)) {
			System.out.println("ListBox content is sorted");
		}
		else
		{
			System.out.println("ListBox content is not sorted");
		}
	
		driver.quit();
		
	}


}
