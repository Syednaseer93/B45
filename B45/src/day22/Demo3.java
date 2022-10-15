package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*There is no selectAll method
 * Note: only deselect methods will not work on SSLB
 * we can use all other methods on both SSLB & MSLB
 * 
 * getWrappedElement->returns all the options as single element
 * 
 * How do u print list box content without using any looping statements?
 * -getWrappedElement
 * 
 *  How do u print list box content in reverse order?
 *  Count the number of options present in list box?
 *  
 */
public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo7.html");

		WebElement listBox = driver.findElement(By.id("A1")); //Single Select list box

		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions(); // returns all the options present in list box
		int count = allOptions.size();
		System.out.println(count);
		
		
		//last to first
		for(int i=count-1;i>=0;i--) {
		String text=allOptions.get(i).getText();
		System.out.println(text);
		}
		
		System.out.println("-----");
		//first to last
		for(WebElement option:allOptions)
			System.out.println(option.getText());
		
		
		
		driver.quit();
	}


}
