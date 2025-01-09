package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import AbstractComponents.AbstractComponent;

public class productCatalogue extends AbstractComponent{
	
	WebDriver driver;
	
	public productCatalogue(WebDriver driver)
	{
		super(driver);
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;

	By productsLoc = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMsg = By.cssSelector("#toast-container");
	
	public List<WebElement> getPrductList()
	{
		waitForElementToBeAppear(productsLoc);
		return products;
		
	}

	public boolean addProductToCart(String productName) throws InterruptedException
	{
		int count =0;
		for(int i=0;i<products.size();i++)
		{
			String element = products.get(i).findElement(By.cssSelector("b")).getText();
			if(products.get(i).findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName))
			{
				System.out.println(element);
				products.get(i).findElement(addToCart).click();
				waitForElementToBeAppear(toastMsg);
				waitForElementToBeDisappear(spinner);
				count++;
			}

		}	
		if (count>0)
		return true;
		else
			return false;
	}
}
