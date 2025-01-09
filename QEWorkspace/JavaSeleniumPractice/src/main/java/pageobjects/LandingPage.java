package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	//driver.get("https://rahulshettyacademy.com/client");
	//driver.findElement(By.id("userEmail")).sendKeys("prasadaraopuppala@gmail.com");
	////driver.findElement(By.id("userPassword")).sendKeys("Target@2024");
	//driver.findElement(By.id("login")).click();
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	@FindBy(id="userPassword")
	WebElement userPassword;
	@FindBy(id="login")
	WebElement login;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMsg;
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	public productCatalogue appLogin(String userName, String password)
	{
		userEmail.sendKeys(userName);
		userPassword.sendKeys(password);
		login.click();
		return new productCatalogue(driver);
	}
	public String getErrorMsg()
	{
		waitForWebElementToBeAppear(errorMsg);
		return errorMsg.getText();
	}

}
