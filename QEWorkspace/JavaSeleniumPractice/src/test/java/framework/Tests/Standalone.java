package framework.Tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String productName="QWERTY";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("prasadaraopuppala@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Target@2024");
		driver.findElement(By.id("login")).click();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		//WebElement prod = products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("qwerty")).findFirst().orElse(null);
		//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		for(int i=0;i<products.size();i++)
		{
			String element = products.get(i).findElement(By.cssSelector("b")).getText();
			if(products.get(i).findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName))
			{
				System.out.println(element);
				products.get(i).findElement(By.cssSelector(".card-body button:last-of-type")).click();
			}
			
		}
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));
		System.out.println(cartproducts.size());
		Boolean result = cartproducts.stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(result);
		driver.findElement(By.cssSelector(".totalRow button")).click();
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".ta-results")));
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']"))).perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")));
		driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
		
	}

}
