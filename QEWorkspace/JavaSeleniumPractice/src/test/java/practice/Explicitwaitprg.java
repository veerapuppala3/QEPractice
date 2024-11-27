package practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/seleniumPractise/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		String[] items = {"Cucumber","Brocolli","Beetroot"};
		addItems(driver, items);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.print(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	
	public static void addItems(WebDriver driver, String[] items) {
		
		
		List<String> itemsList = Arrays.asList(items);
		List<WebElement> we=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<we.size();i++)
		{
			String[] itemname=we.get(i).getText().split("-");
			String formattedname = itemname[0].trim();
			int j=0;
			if(itemsList.contains(formattedname))
			{
				j++;
				
				driver.findElements(By.cssSelector(("div.product-action button"))).get(i).click();
				if(j==3)
					break;
			}
		}
		
		
	}
	
}