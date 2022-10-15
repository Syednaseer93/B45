package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * specified option is present in listbox or not
 * 
 */
public class Demo9 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		String expected="Pune";//scanner code
		String msg="Not Found";
		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo7.html");

		WebElement listBox = driver.findElement(By.id("A1")); 

		Select select=new Select(listBox);
		
		List<WebElement> allOptions = select.getOptions();
		
				
		for(WebElement option:allOptions) 
		{
		
			String text=option.getText();
			if(text.equalsIgnoreCase(expected)) {
				msg="Found";
			}
		}
		
		System.out.println(expected+":"+msg);
		
		
		
		
	
		driver.quit();
		
	}


}
