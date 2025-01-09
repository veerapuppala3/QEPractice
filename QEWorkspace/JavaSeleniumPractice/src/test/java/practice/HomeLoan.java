package practice;

import org.testng.annotations.Test;

public class HomeLoan {
	
	@Test(groups= {"smoke"})
	public void check1()
	{
		System.out.println("Home loan1");
	}

	@Test()
	public void check2()
	{
		System.out.println("Home loan2");
	}
	@Test()
	public void check3()
	{
		System.out.println("Home loan3");
	}

	@Test()
	public void check4()
	{
		System.out.println("Home loan4");
	}
}
