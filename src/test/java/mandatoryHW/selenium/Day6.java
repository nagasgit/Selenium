package mandatoryHW.selenium;

import java.util.concurrent.TimeUnit;

import org.apache.groovy.json.internal.Chr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Day6 {
	
	@Test
	public void day6() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='goAhead()']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
