package extendReport;

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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalone {
	
	ExtentReports extentReport;

@BeforeTest
public void beforeTest()
{
	String path = "D:\\QEPractice\\QEWorkspace\\JavaSeleniumPractice\\Reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Results");
	reporter.config().setDocumentTitle("Test Results");
	
	extentReport = new ExtentReports();
	extentReport.attachReporter(reporter);
	extentReport.setSystemInfo("Tester", "Veera");
}
@Test
public void extentReportTest()
{
		// TODO Auto-generated method stub
	ExtentTest extentTest = extentReport.createTest("Create Demo");
		String productName="QWERTY";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("prasadaraopuppala@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Target@2024");
		driver.findElement(By.id("login")).click();
		//extentTest.fail("Tst failed");
		extentReport.flush();
}

}
