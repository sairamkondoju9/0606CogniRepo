package draganddrop;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadTest {
	@Test
	public void fileUpload() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/file-upload");
		driver.findElement(By.id("file")).sendKeys("path");
		//use send keys
		//find input tag
		//website is rendering compoents slow
		//Thread.sleep(2000);
		//implicit wait:(static sites)checks every elements for evry 1/2 secs 500ms
		//implicit does not check and wait foe the element
		
		//explicit wait:dynamic website it dont care weather element is visible of the screen
		
		//it holds the dom for 10times 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("path"))).click();//when ever element is ready to clickable
				// webdriverwait is a class
	}

}
