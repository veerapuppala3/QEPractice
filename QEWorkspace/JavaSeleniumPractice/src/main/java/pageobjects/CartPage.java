package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {

	WebDriver driver;
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".totalRow button")
	WebElement checkOut;
	
	@FindBy(css=".cartSection h3")
	List<WebElement> cartProducts;
	
	public boolean verifyProductDispaly(String productName)
	{
		System.out.println(cartProducts.size());
		Boolean result = cartProducts.stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
		return result;
		
	}
	
	public CheckoutPage gotoCheckOut()
	{
		checkOut.click();
		return new CheckoutPage(driver);
		
	}
	
	

}
