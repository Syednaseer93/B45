package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*Select class can be used to handle both Single Select and Multi Select list box
 * To check the type of list box we can use isMultiple()-> true ->Multi Select list box; false -> Single Select list box
 * On Multi Select listbox we can use deselect methods
 * deselectByIndex(int)   deselectByValue(String)   deselectByVisibleText(String)  deselectAll()
 * if we try to use any of the deselect method on Single Select list box then we get UnsupportedOperationException
 * 
 * 
 */
public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo7.html");

		WebElement listBox = driver.findElement(By.id("A1")); //Single Select list box

		Select select=new Select(listBox);
		
		Thread.sleep(500);
		select.selectByIndex(1);
		Thread.sleep(500);
		select.selectByValue("c");
		Thread.sleep(500);
		select.selectByVisibleText("Delhi");
		
		boolean res1 = select.isMultiple();
		System.out.println(res1);//false
		
		try 
		{
			select.deselectByIndex(0);//UnsupportedOperationException
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		WebElement listBox2 = driver.findElement(By.id("A2")); //Multi Select list box
		Select select2=new Select(listBox2);
		Thread.sleep(500);
		select2.selectByIndex(0);
		Thread.sleep(500);
		select2.selectByValue("b");
		Thread.sleep(500);
		select2.selectByVisibleText("Snacks");
		
		boolean res2 = select2.isMultiple();
		System.out.println(res2);//true
		
		Thread.sleep(500);
		select2.deselectByIndex(0);
		Thread.sleep(500);
		select2.deselectByValue("b");
		Thread.sleep(500);
		select2.deselectByVisibleText("Snacks");
		
		WebElement listBox3 = driver.findElement(By.id("A3")); //Multi Select list box
		Select select3=new Select(listBox3);
		Thread.sleep(500);
		select3.deselectAll();
	}


}
