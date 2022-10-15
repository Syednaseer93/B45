package day32;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Demo1 {

	@DataProvider
	public Iterator<String> getData()
	{
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Bhanu");
		a.add("Ravi");
		a.add("Chandra");
		a.add("Bhumi");
		
		Iterator<String> data = a.iterator();
		
		return data;
	}	
	
	@Test(dataProvider = "getData")
	public void createUser(String un) 
	{
		Reporter.log("Create "+un,true);
	}
}
