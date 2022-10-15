package day10;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class demo5 {
 @Test
 public void testA() {
	 Assert.assertEquals("abc","xyz","bye bye");
 }
 
 @AfterMethod
 public void a(ITestResult t) {
	 Throwable s = t.getThrowable();
	 System.out.println("***"+s);
	 String m=s.getMessage();
	 System.out.println("***"+m+"***");
 }
 
}
