package AbstractComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.CartPage;
import pageobjects.OrderHistoryPage;

public class AbstractComponent {
	
	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="[routerlink*='myorders']")
	WebElement myOrders;
	
	@FindBy(css="[routerlink*='cart']")
	WebElement cartIcon;
	
	public void waitForElementToBeAppear(By findBy)
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForWebElementToBeAppear(WebElement findBy)
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	public void waitForElementToBeDisappear(WebElement element) throws InterruptedException
	{
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//wait.until(ExpectedConditions.invisibilityOf(element));
	Thread.sleep(1000);
	}
	
	public CartPage goToCart()
	{
		cartIcon.click();
		return new CartPage(driver);
	}
	public OrderHistoryPage goToOrders()
	{
		myOrders.click();
		return new OrderHistoryPage(driver);
	}
}
