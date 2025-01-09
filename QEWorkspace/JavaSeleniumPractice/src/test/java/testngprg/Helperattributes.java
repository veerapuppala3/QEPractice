package testngprg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Helperattributes {
	@Test(enabled=false)
	public void enabledtruefalse()
	{
		System.out.println("enabledtruefalse");
	}
	@Test(timeOut=4000)
	public void timeouttest()
	{
		System.out.println("timeouttest");
	}
	@Test(dependsOnMethods= {"dependsontest1","timeouttest"})
	public void adependsontest2()
	{
		System.out.println("dependsontest2");
		
	}
	
	@Test(dataProvider ="getData")
	public void dependsontest1(String a, String b)
	{
		System.out.println("dependsontest1");
		System.out.println(a);
		System.out.println(b);
		
	}

	
	@DataProvider()
	public Object[][] getData()
	{
		System.out.println("dependsontest1");
		
		Object[][] obj = new Object[2][2];
		obj[0][0] = "bcd";
		obj[0][1] = "abc";
		obj[1][0] = "bcd";
		obj[1][1] = "abc";
		return obj;
	}

}
