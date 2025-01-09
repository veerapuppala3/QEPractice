package practice;

import org.testng.annotations.Test;

public class CarLoan {
	
	@Test(priority =-1,enabled=false)
	public void check1()
	{
		System.out.println("Car loan1");
	}

	@Test(groups= {"smoke"})
	public void check2()
	{
		System.out.println("Car loan2");
	}
}
