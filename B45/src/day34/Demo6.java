package day34;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*
 * Can we send a value from suite file to any method of test class?
 * Yes - using <parameter>
 * 
 * 
 */

public class Demo6 {

	@Parameters({"city","state"})
	@Test
	public void testA(@Optional("Delhi") String c,@Optional("Delhi") String s)
	{
		Reporter.log(c,true);
		Reporter.log(s,true);
	}
}
