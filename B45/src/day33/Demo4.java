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

public class Demo4 {
	
  @BeforeMethod  //execute this method before every test method (iteration)
  public void login() {
	  Reporter.log("login",true);
  }
  
  @AfterMethod//execute this method after every test method (iteration)
  public void logout() {
	  Reporter.log("logout",true);
  }
  
  @Test(invocationCount = 2)
  public void createUser() {
	  Reporter.log("createUser",true);
  }
  
  @Test
  public void deleteUser() {
	  Reporter.log("deleteUser",true);
  }
  
 }
