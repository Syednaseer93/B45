package day18;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the Subject");
		Scanner sc=new Scanner(System.in);
		String sub=sc.next();
		sc.close();
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Demo5.html");
		List<WebElement> allHeaders=driver.findElements(By.tagName("th"));
		
		//searching the index of the required header
		int index=1;
		for(WebElement header:allHeaders)
		{
			String text= header.getText();
			if(text.equals("Select")) {
				break;
			}
			index++;						//Not found
		}
		
		System.out.println(index);
		
		
		String xp="//td[.='"+sub+"']/../td["+index+"]/input";
		driver.findElement(By.xpath(xp)).click();
		
//		driver.quit();
	}

}
