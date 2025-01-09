package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngexp1 {
	
	@Test(groups= {"smoke"})
	public void mobileTest1()
	{
		System.out.println("mobileTest1");
	}

	@Parameters({"URL"})
	@Test()
	public void mobileTest2(String url)
	{
		System.out.println("mobileTest2");
		System.out.println(url);
	}
	
	@Test()
	public void mobileTest3()
	{
		System.out.println("mobileTest3");
	}
	@Test()
	public void mobileTest4()
	{
		System.out.println("mobileTest4");
	}
	@Test()
	public void mobileTest5()
	{
		System.out.println("mobileTest5");
	}
	@Test(groups= {"smoke"})
	public void mobileTest6()
	{
		System.out.println("mobileTest6");
	}
}
