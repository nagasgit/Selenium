package mandatoryHW.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	public void day4()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		wait.until(ExpectedConditions.elementToBeClickable(viewAll)).click();
	}

}
