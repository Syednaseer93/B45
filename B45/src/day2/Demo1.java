package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		//set the path of driver executable
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
		
		//Open the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//enter the URL
		driver.get("http://www.google.com");
		
		//closing the browser
//		driver.close();

	}

}
