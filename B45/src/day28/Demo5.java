package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class LoginPage2{//Page class
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	LoginPage2(WebDriver driver){
		unTB = driver.findElement(By.id("username"));
		pwTB = driver.findElement(By.name("pwd"));
		loginBTN = driver.findElement(By.xpath("//div[.='Login ']"));
	}
	
	void setUserName(String un){
		unTB.sendKeys(un);
	}
	
	void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	
	void clickLogin(){
		loginBTN.click();
	}
}

public class Demo5 {//Test Class
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://demo.actitime.com/login.do");
		LoginPage2 loginPage2=new LoginPage2(driver);

		
		loginPage2.setUserName("bhanu");
		loginPage2.setPassword("damager");
		loginPage2.clickLogin();
		
		
		Thread.sleep(3000);
		
		
		loginPage2.setUserName("admin");
		loginPage2.setPassword("manager");
		loginPage2.clickLogin();
		
		
	}
}











