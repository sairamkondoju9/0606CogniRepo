package draganddrop;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SliderExample {
	@Test
	public void sliderexample() {
		WebDriver driver = new ChromeDriver();
		driver.get("https:")
		WebElement sliderInput =driver.findElement(By.id("volume"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 100", sliderInput);
		js.executeScript("arguments[0].dispatchEvent(new Event('change'))", sliderInput);
		
		
	}

}
