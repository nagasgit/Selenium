package mandatoryHW.selenium.week7CW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumAssessment_Wk7 extends BaseCls_Week7
{
	@Test
	public void seltest1() throws InterruptedException
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//p[text()='SDET-5']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		WebElement create = driver.findElement(By.xpath("//span[text()='Create']"));
		wait.until(ExpectedConditions.elementToBeClickable(create));
		create.click();
		driver.findElement(By.xpath("//input[@id='summary-field']")).sendKeys("Sdet5 Nagarajan");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search backlog']")).sendKeys("Sdet5 Nagarajan",Keys.TAB);
		
		boolean enabled = driver.findElement(By.xpath("//div[text()='Sdet5 Nagarajan']")).isEnabled();
		Assert.assertTrue(enabled,"summary not found");
		
		
	}

}
