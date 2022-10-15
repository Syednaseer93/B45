package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class LoginPage{//Page class
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	LoginPage(WebDriver driver){
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

public class Demo4 {//Test Class
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://demo.actitime.com/login.do");
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.setUserName("admin");
		loginPage.setPassword("manager");
		loginPage.clickLogin();
	}
}
