package framework.Tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AbstractComponents.AbstractComponent;
import framework.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LandingPage;
import pageobjects.OrderConfPage;
import pageobjects.OrderHistoryPage;
import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.productCatalogue;
public class SubmitOrderTest extends BaseTest{

	String productName="QWERTY";
	/*
	 * @Test() public void submitOrderTest() throws IOException,
	 * InterruptedException { // TODO Auto-generated method stub
	 * 
	 * productCatalogue productCatalogue =
	 * landingPage.appLogin("prasadaraopuppala@gmail.com", "Target@2024");
	 * AbstractComponent abc = new AbstractComponent(driver);
	 * abc.waitForElementToBeAppear(By.cssSelector(".mb-3"));
	 * productCatalogue.addProductToCart(productName); CartPage cartPage =
	 * abc.goToCart(); Boolean result = cartPage.verifyProductDispaly(productName);
	 * Assert.assertTrue(result); CheckoutPage checkoutPage
	 * =cartPage.gotoCheckOut(); checkoutPage.selectCountry("India"); OrderConfPage
	 * orderConfirm = checkoutPage.submitOrder();
	 * Assert.assertEquals("THANKYOU FOR THE ORDER.", orderConfirm.orderConfirm());
	 * }
	 */

	
	  @Test(dataProvider="getData", groups= {"Purchase"}) 
	  public void submitOrderTest(String email, String password, String productName) throws IOException,
	  InterruptedException { // TODO Auto-generated method stub
	  
	  productCatalogue productCatalogue = landingPage.appLogin(email,password );
	  AbstractComponent abc = new AbstractComponent(driver);
	  abc.waitForElementToBeAppear(By.cssSelector(".mb-3"));
	  productCatalogue.addProductToCart(productName); 
	  CartPage cartPage =abc.goToCart(); 
	  Boolean result = cartPage.verifyProductDispaly(productName);
	  Assert.assertTrue(result);
	  CheckoutPage checkoutPage=cartPage.gotoCheckOut(); 
	  checkoutPage.selectCountry("India"); 
	  OrderConfPage orderConfirm = checkoutPage.submitOrder();
	  Assert.assertEquals("THANKYOU FOR THE ORDER.", orderConfirm.orderConfirm());
	  }
	 
	
	/*@Test(dependsOnMethods= {"submitOrderTest"})
	public void OrderHistoryTest() throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		productCatalogue productCatalogue = landingPage.appLogin("prasadaraopuppala@gmail.com", "Target@2024");
		OrderHistoryPage ordersCheck = productCatalogue.goToOrders();
		Boolean result =ordersCheck.verifyProductNameDispaly(productName);
		Assert.assertTrue(result);
	}
	*/
	@DataProvider()
	public Object[][] getData() {
		
		//return new Object[][] {{"anshika@gmail.com", "Iamking@000", "ZARA COAT 3"}, {"prasadaraopuppala@gmail.com","Target@2024","QWERTY"}};
		
		return new Object[][] {{"prasadaraopuppala@gmail.com","Target@2024","QWERTY"}};
		
	}
	
	public String getScreenshot(String testcaseName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("D:\\QEPractice\\QEWorkspace\\JavaSeleniumPractice\\reports\\"+testcaseName+".png");
		FileUtils.copyFile(source, file);
		return "path";
	}
	

}
