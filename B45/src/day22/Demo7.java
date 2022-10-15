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
public class Demo7 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		ArrayList<String> allText=new ArrayList<String>(); //creating array list
		
		allText.add("BreakFast");
		allText.add("Lunch");
		allText.add("Snacks");
		allText.add("Dinner");
		
		System.out.println(allText);
		
		Collections.sort(allText);
		
		System.out.println(allText);
		
	}


}
