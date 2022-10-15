package day33;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  

	@BeforeClass
	public void openApp()
	{
		Reporter.log("Open App",true);
	}
	
	@AfterClass
	public void closeApp() {
		Reporter.log("Close App",true);
	}
	
	
	  @BeforeMethod 
	  public void login() {
		  Reporter.log("login",true);
	  }
	  
	  @AfterMethod
	  public void logout() {
		  Reporter.log("logout",true);
	  }

}
