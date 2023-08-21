package mandatoryHW.selenium;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.util.Date;
import org.asynchttpclient.util.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Day3 extends BaseCls {
	public void day3() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		wait.until(ExpectedConditions.elementToBeClickable(viewAll)).click();
		driver.findElement(By.xpath("//*/span/p[text()='Sales']")).click();
		WebElement compaign = driver.findElement(By.xpath("//a[@title='Campaigns']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", compaign);
		WebElement newBtn = driver.findElement(
				By.xpath("//li[@data-target-selection-name='sfdc:StandardButton.Campaign.New']/a/div[@title='New']"));
		wait.until(ExpectedConditions.elementToBeClickable(newBtn)).click();
		driver.findElement(By.xpath("(//span[text()='Campaign Name']/following::input[@class=' input'])[1]"))
				.sendKeys("BootCamp_Naga");
		WebElement startDate = driver
				.findElement(By.xpath("(//div[contains(@class,'uiInput uiInputDate')]//input[@class=' input'])[1]"));
		startDate.click();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		Calendar calender = Calendar.getInstance();
		System.out.println(Calendar.getInstance());
		calender.setTime(date);
		String date1 = dateFormat.format(calender.getTime());
		startDate.sendKeys(date1);
		calender.add(Calendar.DAY_OF_YEAR, 1);
		String endDate2 = dateFormat.format(calender.getTime());
		driver.findElement(By.xpath("(//div[contains(@class,'uiInput uiInputDate')]//input[@class=' input'])[2]"))
				.sendKeys(endDate2);
		driver.findElement(By.xpath("//button[3]/span[text()='Save']")).click();
		String successMsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds')]")).getText();
		Assert.assertTrue(successMsg.contains("was created."));

	}

}
