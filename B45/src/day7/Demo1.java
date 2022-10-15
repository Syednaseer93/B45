package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Anything present on the page is called as WebElement
 * elements are created using HTML
 * every element will have 3 comp- tag ,attr & text
 * Before performing any action we should identify the element
 * to identify the element we use locators 
 * Locators are static method of By class
 * By class is -abstract class
 * locator is used as arg for findElement & findElements
 * 
 * Possibility 
 * 1. locator can match with one element->findElement returns address of
 * matching element
 * 
 * 2. locator not matching with any element--> throws NoSuchElementException
 * 
 * 3. locator matching with multiple elements--> it returns the address of
 *   1st matching element
 *   
 *   above behaviour is same for all the locators
 *
 *  */

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Demo2.html");
		WebElement element = driver.findElement(By.tagName("a"));
		element.click();
	

		
	}

}







