package day5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();//open the browser
		driver.get("http://www.google.com");//enter the url
		String title = driver.getTitle();//get the title of the page
		System.out.println(title);//print the title
		driver.quit();	//close the browser
		
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("http://www.google.com");
		String title1=driver1.getTitle();
		System.out.println(title1);
		driver1.quit();

	}

}
