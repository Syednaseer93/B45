package day45;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*in our project we have 10 modules 
 * user customer product..... 
 * 50 TC in each module --> 500- full RT
 * change to Customer module 
 * only customer related test cases- RRT - save time 50 TC
 * 
 */
public class Demo1 {

	@BeforeMethod(alwaysRun = true)
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@BeforeMethod(groups={"User"})
	public void sendEmail() {
		Reporter.log("sendEmail",true);
	}
	
	
	@Test(groups={"User","Smoke"})
	public void createUser()
	{
		Reporter.log("create user",true);
	}
	
	@Test(groups={"User"})
	public void editUser()
	{
		Reporter.log("edit user",true);
	}
	
	@Test(groups={"User"})
	public void deleteUser()
	{
		Reporter.log("delete user",true);
	}
	
	@Test(groups={"Customer","Smoke"})
	public void createCustomer()
	{
		Reporter.log("create Customer",true);
	}
	
	@Test(groups={"Customer"})
	public void editCustomer()
	{
		Reporter.log("edit Customer",true);
	}
	
	@Test(groups={"Customer"},enabled = false)
	public void deleteCustomer()
	{
		Reporter.log("delete Customer",true);
	}
	
	
	@Test(groups={"Product","Smoke"})
	public void createProduct()
	{
		Reporter.log("create Product",true);
	}
	
	@Test(groups={"Product"})
	public void editProduct()
	{
		Reporter.log("edit Product",true);
	}
	
	@Test(groups={"Product"})
	public void deleteProduct()
	{
		Reporter.log("delete Product",true);
	}
}
