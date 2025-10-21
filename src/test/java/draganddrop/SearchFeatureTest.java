package draganddrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFeatureTest {
	@Test
	public void search() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement inputField = driver.findElement(By.id("twotabssearchtextbox"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'Laptops';", inputField);
		WebElement clickElement=driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click();", clickElement);
		
		
	}

}
