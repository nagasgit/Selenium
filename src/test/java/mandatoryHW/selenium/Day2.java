package mandatoryHW.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Day2 extends BaseCls {
	
	@Test
	public void createDashboard() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(viewAll)).click();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search apps\")]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search apps\")]")).sendKeys("dashboards");
		WebElement dashboard = driver.findElement(By.xpath("//p/mark[text()='Dashboards']"));
		wait.until(ExpectedConditions.elementToBeClickable(dashboard)).click();
		
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='dashboardNameInput']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", name);
		//wait.until(ExpectedConditions.elementToBeSelected(name));
		//driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).
		//Thread.sleep(10000);
		//driver.findElement(By.id("dashboardNameInput")).sendKeys("Salesforce Automation by Naga");
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Salesforce Automation by Naga");
		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		
		
	}

}
