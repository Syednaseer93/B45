package day6;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//how to open new tab or new window? (Selenium4 )
// later in advance topics we will discuss how to do this in Selenium 3


public class Demo6 {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		 WindowType option1 = WindowType.TAB;
		 
		driver.switchTo().newWindow(option1);//open new tab
		
		driver.get("http://www.fb.com");
		WindowType option2 = WindowType.WINDOW;
		
		driver.switchTo().newWindow(WindowType.TAB);//new window
		driver.get("http://aksharatraining.com");
	}
}