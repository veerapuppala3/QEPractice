package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class OrderHistoryPage extends AbstractComponent{

	WebDriver driver;
	public OrderHistoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="tr td:nth-child(3)")
	List<WebElement> productNamesOrder;
	
	public boolean verifyProductNameDispaly(String productName)
	{
		System.out.println(productNamesOrder.size());
		Boolean result = productNamesOrder.stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
		return result;
		
	}
}
