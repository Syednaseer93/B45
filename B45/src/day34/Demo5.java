package day34;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
/*How do u run a test only when other test is pass?
 * -->dependsOnMethods
 * 
 * if test has both priority & dependsOnMethods , which on is used?
 * dependsOnMethods 
 * 
 * if 2 methods are dependent on each other what happens
 * we get TestNGException - cyclic dependencies 
 * 
 * Note: if m1 depends on m2 and if m2 fails then m1 will be 'SKIPPED'
 */
public class Demo5 {

	@Test
	public void testLogin() {
		Reporter.log("login",true);
	}
	
	@Test(priority = 2)
	public void testCreateUser()
	{
		Reporter.log("Create User Bhanu",true);
		Assert.fail();
	}
	
	@Test(priority=1,dependsOnMethods = {"testLogin","testCreateUser"})
	public void testDeleteUser()					//when this method will be executed -> if testLogin & testCreateUser is PASS
	{
		Reporter.log("Delete User Bhanu",true);
	}
}
