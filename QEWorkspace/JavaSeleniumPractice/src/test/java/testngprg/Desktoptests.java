package testngprg;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Desktoptests {
	@BeforeSuite()
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}
	
	@AfterSuite()
	public void aftersuite()
	{
		System.out.println("aftersuite");
	}
	
	@BeforeClass()
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	@AfterClass()
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	
	
	@BeforeTest()
	public void beforetest()
	{
		System.out.println("beforetest");
	}
	
	@AfterTest()
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	
	@BeforeMethod()
	public void beforemethd()
	{
		System.out.println("beforemethd");
	}
	
	@AfterMethod()
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@Test(groups= {"smoke"})
	public void test1()
	{
		System.out.println("Desktoptests test1");
	}

	@Test()
	public void test2()
	{
		System.out.println("Desktoptests test2");
	}

	@Test()
	public void test3()
	{
		System.out.println("Desktoptests test3");
		Assert.assertTrue(false);
	}

}
