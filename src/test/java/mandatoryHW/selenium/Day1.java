package mandatoryHW.selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

import dev.failsafe.internal.util.Assert;

public class Day1 extends BaseCls {

	@Test
	public void seleniumTest() throws InterruptedException {
		// TODO Auto-generated method stub


		// Thread.sleep(1000);
		WebElement icon = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		//wait.until(ExpectedConditions.elementToBeClickable(icon)).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(icon)).click();
		// icon.click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		WebElement ele = driver.findElement(By.xpath("//a[@title='Accounts']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);

		driver.findElement(By.xpath("//div[@title='New']")).click();

		//WebElement accountName = driver.findElement(By.xpath("//input[@name='Name']"));
		//wait.until(ExpectedConditions.elementToBeSelected(accountName));
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Nagarajan");

		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

}
