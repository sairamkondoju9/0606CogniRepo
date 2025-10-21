package draganddrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pg1 {
@Test
public void main() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://v1.training-support.net/selenium/input-events");
	System.out.println(driver.getTitle());

	Thread.sleep(5000);
	Actions actions = new Actions(driver);
	actions.contextClick();
	actions.keyDown(Keys.SHIFT).sendKeys("s").keyDown(Keys.SHIFT).build().perform();
	actions.keyDown(Keys.CONTROL).keyDown("a").build().perform();
	
	
	
}
}
