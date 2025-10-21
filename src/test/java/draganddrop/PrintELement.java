package draganddrop;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintELement {
	@Test
	public void printEle() {
		WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/ajax");

        WebElement button = driver.findElement(By.xpath("//button[text()='Change Content']"));
        button.click();

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));

        WebElement output = driver.findElement(By.tagName("h3"));
        System.out.println(output.getText());
        driver.quit();

		
		
	}

}
