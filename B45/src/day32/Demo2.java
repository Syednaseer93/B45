package day32;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*Iteration depends on number of rows
 * Number of arguments should be same as number of columns
 * 
 * 
 */

public class Demo2 {

	@DataProvider
	public String[][]  getData()
	{
		String[][] data=new String[3][2];
		
		data[0][0]="Bhanu";
		data[0][1]="B123";
		
		data[1][0]="Ravi";
		data[1][1]="R123";
		
		data[2][0]="Bhumi";
		data[2][1]="B456";
		
		return data;
	}	
	
	@Test(dataProvider = "getData")
	public void createUser(String un,String pw) 
	{
		Reporter.log("Create "+un+" with pw:"+pw,true);
	}
}
