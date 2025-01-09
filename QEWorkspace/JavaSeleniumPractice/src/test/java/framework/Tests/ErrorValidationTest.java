package framework.Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import AbstractComponents.AbstractComponent;
import framework.TestComponents.BaseTest;
import framework.TestComponents.RetryListener;
import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.OrderConfPage;
import pageobjects.productCatalogue;

public class ErrorValidationTest extends BaseTest{
	
	@Test(groups= {"ErrorHandling"}, retryAnalyzer=RetryListener.class)
	public void LoginErrorValidation()
	{
		landingPage.appLogin("prasadaraopuppala@gmail.com", "Target2024");
		Assert.assertEquals("Incorrect email or password..", landingPage.getErrorMsg());
	}
	
	@Test()
	public void ProductErrorValidation() throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		String productName="QWERTYy";
		productCatalogue productCatalogue = landingPage.appLogin("prasadaraopuppala@gmail.com", "Target@2024");
		AbstractComponent abc = new AbstractComponent(driver);
		abc.waitForElementToBeAppear(By.cssSelector(".mb-3"));
		Boolean result=productCatalogue.addProductToCart(productName);
		System.out.println(result);
		Assert.assertFalse(result);
	}


}
