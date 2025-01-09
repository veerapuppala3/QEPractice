package testngprg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mobiletests {
	
	@Parameters({"url"})
	@Test()
	public void mobileTest1(String url)
	{
		System.out.println("mobileTest1");
		System.out.println(url);
	}

	@Test(groups= {"smoke"})
	public void mobileTest2()
	{
		System.out.println("mobileTest2");
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
	@Test()
	public void mobileTest6()
	{
		System.out.println("mobileTest6");
	}
}
