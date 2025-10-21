package draganddrop;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {
	@Test
	public void fluentWaitExample() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-content");
		driver.findElement(By.id("genButton")).click();
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class);
		
		fluentWait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "meaning"));
		String text = driver.findElement(By.id("word")).getText();
		System.out.println(text+"req string");
		driver.quit();
	}

}
