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

public class Demo3 {

	@DataProvider
	public Iterator<String[]>  getData()
	{
		ArrayList<String[]> a=new ArrayList<String[]>();
		
		String[] s1= {"Bhanu","b123"};
		a.add(s1);//1 row
		
		String[] s2= {"Ravi","R123","r456"};
		
		a.add(s2);//2 row
		
		Iterator<String[]> data = a.iterator();
		
		return data;
	}	
	
	@Test(dataProvider = "getData")
	public void createUser(String... s) 
	{
		Reporter.log("----",true);
		
		for(String v:s) {
		Reporter.log(v,true);
		}
		
		Reporter.log("----",true);
	}
}
