package mandatoryHW.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day5_CW {
	@Test
	public void day5() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		// driver.switchTo().frame("iframeResult");
		driver.manage().window().maximize();

		WebElement selectTool = driver.findElement(By.className("ui-selectonemenu"));
		Select sel = new Select(selectTool);

		// sel.selectByIndex(0);
		List<WebElement> options = sel.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}

	}

}
