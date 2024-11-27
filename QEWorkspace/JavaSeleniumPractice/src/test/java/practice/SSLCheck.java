package practice;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().deleteAllCookies();
		driver.get("https://expired.badssl.com/");
		System.out.print(driver.getTitle());
		
		/*
		 * Proxy proxy = new Proxy(); 
		 * proxy.setHttpProxy(""); 
		 * WebDriver driver = new ChromeDriver(opt);
		 */
	}

}
