package mandatoryHW.selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Day2 extends BaseCls {

	@Test
	public void createDashboard() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// wait.until(ExpectedConditions.elementToBeClickable(viewAll)).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		// driver.findElement(By.xpath("//button[text()='View All']"));
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		wait.until(ExpectedConditions.elementToBeClickable(viewAll)).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search apps\")]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search apps\")]")).sendKeys("dashboards");
		WebElement dashboard = driver.findElement(By.xpath("//p/mark[text()='Dashboards']"));
		wait.until(ExpectedConditions.elementToBeClickable(dashboard)).click();

		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Salesforce Automation by Naga");
		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();

		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
		// Thread.sleep(4000);
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//div[@class='toolbarActions']//div[@role='group']/button[text()='Save']")).click();
		// Thread.sleep(2000);

		WebElement done = driver.findElement(By.xpath("//button[text()='Done']"));
		//wait.until(ExpectedConditions.elementToBeClickable(done)).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeAsyncScript("arguments[0].click();", done);
		/*
		 * 
	
		 */
		// driver.findElement(By.xpath("//button[text()='Done']")).click();
		driver.switchTo().defaultContent();
		// String title = driver.findElement(By.xpath("//span[@title='Salesforce
		// Automation by Naga']")).getText();
		// assertEquals(title, "Salesforce Automation by Naga");

	}

}
