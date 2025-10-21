package draganddrop;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Myntra1 {
	
	@Test
	public void myntraa() {
	
	    WebDriver driver = new ChromeDriver();

	    driver.get("https://www.myntra.com");
	    driver.manage().window().maximize();

	    WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	    search.sendKeys("perfume");
	    search.sendKeys(Keys.ENTER);

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement firstItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-index='0']")));
	    firstItem.click();

	    
	}
}
