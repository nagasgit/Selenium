package mandatoryCW.selenium.salesforceTCs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC3 extends BaseSalesForce{
		
	@Test
		public void CreateWork_Type_Group() throws InterruptedException
		{
				/*
				 * 1. Login to https://login.salesforce.com
					2. Click on the toggle menu button from the left corner
					3. Click View All and click Work Type Groups from App Launcher
					4. Click on the Work Type Group tab 
					5. Search the Work Type Group 'Salesforce Automation by *Your Name*'
					6. Click on the Dropdown icon and Select Edit
				 */
			
			wait = new WebDriverWait(driver,Duration.ofSeconds(15));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//div[contains(@class,'appLauncher slds-context-bar__icon')]//div[@class='tooltipTrigger tooltip-trigger uiTooltip']")).click();
			driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Work Type Groups");
			WebElement ele =  driver.findElement(By.xpath("//a[@data-label='Work Type Groups']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
			driver.findElement(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")).clear();
			driver.findElement(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")).sendKeys("asa");
			driver.findElement(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")).sendKeys(Keys.TAB);
			driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small slds-button--icon')]")).click();
			driver.findElement(By.xpath("//a[@title='Edit']")).click();
			
			/*
			 * driver.get("https://login.salesforce.com/");
			 * driver.findElement((By.id("username")).sendKeys("ramyaseshan01@gmail.com");
			 * driver.findElement(By.id("password")).sendKeys("Appa@1948");
			 * driver.findElement(By.id("Login")).click();
			 * 
			 * driver.findElement(By.xpath("//div[@role='navigation']")).click();
			 * driver.findElement(By.xpath("//button[@aria-label='View All Applications']"))
			 * .click();
			 * 
			 * WebElement WT_Groups =
			 * driver.findElement(By.xpath("//p[text()='Work Type Groups']")); Actions act =
			 * new Actions(driver); act.scrollToElement(WT_Groups).perform();
			 * 
			 * Thread.sleep(3000); WT_Groups.click();
			 * 
			 * // driver.findElement(By.xpath("//div/label[text()='Search this list...']")).
			 * sendKeys("Ramya");
			 * driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Ramya"
			 * );
			 * 
			 * driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Keys.
			 * ENTER);
			 */
	}
}
