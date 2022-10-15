package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*IN Selenium before performing any action (click type select drag and drop double click right click)
 *we should locate the element, for this we use findElement method 
 * findElement takes an argument of type -> By
 * By is an Abstract class
 * 1. does it has a constructor- Yes
 * 2. can we create ref variable for an Abstract class-> Yes
 * 3. can we create Object of an  Abstract class-> No
 * 4. can we develop concrete method in  Abstract class-> Yes
 * 5. Can we create abstract method in  Abstract class-> Yes
 * 6. can we make concrete method as static in Abstract class->Yes
 * 7. Abstract class -> all the method can be abstract-> Yes
 * 8. all the method can be concrete--> Yes
 * 9. *all the method can be  static -> yes*
 * 10.all static methods should be concrete--> Yes
 * (we cant have static with abstract) 
 * 11. in abstract class can we have few abstract , few concrete methods
 *  
 */
public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Demo1.html");
		WebElement e = driver.findElement(By.tagName("a"));
		e.click();
	}

}
