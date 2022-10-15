package day22;

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
 * How do u print list box content without using any looping statements
 */
public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo7.html");

		WebElement listBox = driver.findElement(By.id("A1")); //Single Select list box

		Select select=new Select(listBox);
		WebElement e = select.getWrappedElement();// returns all the options as single element
		String text = e.getText();
		System.out.println(text);
		
		WebElement listBox2 = driver.findElement(By.id("A2")); //Multi Select list box

		Select select2=new Select(listBox2);
		WebElement e2 = select2.getWrappedElement();// returns all the options as single element
		String text2 = e2.getText();
		System.out.println(text2);
		
		driver.quit();
	}


}
