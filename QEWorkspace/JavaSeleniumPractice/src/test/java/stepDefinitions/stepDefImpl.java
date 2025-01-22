package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import AbstractComponents.AbstractComponent;
import framework.TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.LandingPage;
import pageobjects.OrderConfPage;
import pageobjects.productCatalogue;

public class stepDefImpl extends BaseTest{
	
	public LandingPage landingPage;
	public productCatalogue productCatalogue;
	public AbstractComponent abc;
	public CartPage cartPage;
	public OrderConfPage orderConfirm;
	@Given("I landed on Ecomm page")
	public void I_landed_on_Ecomm_page() throws IOException
	{
		landingPage = launchApplication();
		
	}
	
	@Given("^logged in with username (.+) and password (.+)$")
	public void logged_in_with_username_and_password(String userName, String password)
	{
		productCatalogue = landingPage.appLogin(userName,password );
	}
	
	@When("^I add product (.+) to the cart$")
	public void I_add_product_to_the_cart(String productName) throws InterruptedException
	{
		  abc = new AbstractComponent(driver);
		  abc.waitForElementToBeAppear(By.cssSelector(".mb-3"));
		  productCatalogue.addProductToCart(productName); 
	}
	
	 @When("^checkout (.+) and submit the order$")
	 public void checkout_productName_and_submit_order(String productName)
	 {
		  cartPage =abc.goToCart(); 
		  Boolean result = cartPage.verifyProductDispaly(productName);
		  Assert.assertTrue(result);
		  CheckoutPage checkoutPage=cartPage.gotoCheckOut(); 
		  checkoutPage.selectCountry("India"); 
		  orderConfirm = checkoutPage.submitOrder();
	 }
	 
	 @Then("Then I verify the message {string}")
	 public void I_verify_the_message(String message)
	 {
		 Assert.assertEquals(message, orderConfirm.orderConfirm());
	 }

}
