package mandatoryHW.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day5_HW {
	@Test
	public void day5_Hw()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		if (text.contains("OK"))
		{
			System.out.println("pass");
		}
		driver.switchTo().defaultContent();
	}
	
}
