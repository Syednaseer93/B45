package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*Verify that Agra is selected in the listbox
 * Note: if the list box is multi select and no options are selected then 
 * if we use getFirstSelectedOption we get NSEE
 */
public class Demo5 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo7.html");

		WebElement listBox = driver.findElement(By.id("A1")); //Single Select list box

		Select select=new Select(listBox);
		String text = select.getFirstSelectedOption().getText();
		if(text.equals("Agra"))
		{
			System.out.println("Pass: Agra is selected");
		}
		else
		{
			System.out.println("Fail: Agra is not selected");
		}

//		select.getOptions().get(2)  3rd from all
//		select.getAllSelectedOptions().get(2) 3rd one from selected
		
//		select.getAllSelectedOptions().get(0)  1st selected
//		select.getFirstSelectedOption()		1st selected

		
		driver.quit();
	}


}
