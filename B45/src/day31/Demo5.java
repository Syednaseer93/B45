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
 * 
 * If DP is present in Diff class then 
 * 1. Test class should extend Data Provider class (DP method can be static or non-static)
 *  
 * 2. specify the class name using dataProviderClass (DP method should be static)
 * 
 */

class Data{
	@DataProvider
	public static String[] getData()
	{
		String[] data={"Bhanu","Ravi","Chandra","Bhumi"};
		return data;
	}	
}

public class Demo5{
	
	@Test(dataProviderClass = Data.class, dataProvider = "getData")
	public void createUser(String un) 
	{
		Reporter.log("Create "+un,true);
	}

}
