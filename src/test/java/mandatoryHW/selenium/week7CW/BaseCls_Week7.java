package mandatoryHW.selenium.week7CW;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseCls_Week7 
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeMethod
	public void baseccls() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		
		driver.get("https://api-training.atlassian.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("India@123");
		driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
		//driver.findElement(By.xpath("//a[text()='View all projects']")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
}
