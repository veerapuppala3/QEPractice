package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameedit = driver.findElement(By.cssSelector("[name='name']"));
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		WebElement checkboxtext = driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameedit)).getText());
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		driver.findElement(with(By.tagName("input")).toLeftOf(checkboxtext)).click();
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
		
	}

}
