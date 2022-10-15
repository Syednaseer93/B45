package day31;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*Data Driven Testing 
 * test multiple times with diff data
 * 
 * Data Provider 
 * 
 * 1. return type of Data Provider
 *    we cant return a value, we must return object[]  object[][]  Iterator<Object>  Iterator<Object[]> 
 * 
 * How do u store diff data types in Data provider? --> Object[] 
 * 
 * we cant use multiple Data Provider in same test method
 * 
 * Mulitple Test methods can take data from same Data provider method
 */

public class Demo4 {
	
	@DataProvider
	public String[] getData()
	{
		String[] data={"Bhanu","Ravi","Chandra","Bhumi"};
		return data;
	}
	
		
	
	@Test(dataProvider = "getData")
	public void createUser(String un) 
	{
		Reporter.log("Create "+un,true);
	}

	@DataProvider
	public Object[] getData2()
	{
		Object[] data={"Bhanu",1,true};
		
		return data;
	}
	
	
	@Test(dataProvider = "getData2")
	public void createUser2(Object un) 
	{
		Reporter.log("Create "+un,true);
	}
}
