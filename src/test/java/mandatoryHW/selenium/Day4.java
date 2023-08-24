package mandatoryHW.selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4 extends BaseCls{
	/*
	 * 	1. Launch https://login.salesforce.com/ 
		2. Login to Salesforce with your username and password
		3. Click on the App Launcher (dots)
		4. Click View All
		5. Type Content on the Search box
		6. Click the Content Link
		7. Click on Chatter Tab
		8. Verify the Chatter title on the page
		9. Click the Question tab
		10. Type Question 
		11. Type Details 
		12. Click Ask
		13. Confirm the question appears
		14. Close the browser
	 * 
	 */
	@Test
	public void day4() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		wait.until(ExpectedConditions.elementToBeClickable(viewAll)).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("content",Keys.TAB);
		
		driver.findElement(By.xpath("//a//span/*/mark[text()='Content']")).click();
		
		WebElement chatter = driver.findElement(By.xpath("//a[@title='Chatter']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chatter);
		
		//wait.until(ExpectedConditions.visibilityOf(chatter)).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[contains(@class,'cuf-questionTitleField')]")).sendKeys("hello");
		driver.findElement(By.xpath("//div[contains(@data-placeholder,'If you have more to say,')]")).sendKeys("i am here to learn programming");
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		String text = driver.findElement(By.xpath("//span[text()='i am here to learn programming']")).getText();
		Assert.assertEquals(text, "i am here to learn programming");
		
		Select ele = new Select(chatter);
	}

}
