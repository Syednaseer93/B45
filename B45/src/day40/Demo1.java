package day40;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeMethod
	public void openApp(Method m) {
		Reporter.log("openApp",true);
		System.out.println("Next is :" +m.getName());
	}
	
	@AfterMethod
	public void closeApp(ITestResult result)
	{
		String n=result.getName();
		
		int s = result.getStatus();
		System.out.println("Test is :"+n+" and its status is:"+s);
		Reporter.log("closeAPP",true);
	}
	
	
	@Test
	public void testA()
	{
		Reporter.log("testA",true);
	}
	
	
	@Test
	public void testB()
	{
		Reporter.log("testB",true);
		Assert.fail();
	}
	
	@Test
	public void testC()
	{
		Reporter.log("testC",true);
	}
}
