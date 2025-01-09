package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent{

	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement countryField; 
	
	@FindBy(css=".action__submit")
	WebElement submit; 
	
	@FindBy(xpath="(//button[contains(@class,'ta-item')])[2]")
	WebElement selectCountry; 
	
	@FindBy(xpath="//a[@class='btnn action__submit ng-star-inserted']")
	WebElement movetoElement; 
	
	public void selectCountry(String countryName)
	{
		Actions a = new Actions(driver);
		a.sendKeys(countryField, countryName).build().perform();
		waitForElementToBeAppear(By.cssSelector(".ta-results"));
		selectCountry.click();
		a.moveToElement(movetoElement).perform();
	}
	
	public OrderConfPage submitOrder()
	{
		submit.click();
		return new OrderConfPage(driver);
	}
	
	
}
