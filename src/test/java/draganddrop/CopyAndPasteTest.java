package draganddrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPasteTest {
	ChromeDriver driver = new ChromeDriver();
	@Test
	public void copyNpaste() {
		
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		WebElement FullNameInoutField = driver.findElement(By.xpath("//input[@placeholder ='Full name']"));
		FullNameInoutField.sendKeys("Dilip");
		FullNameInoutField.sendKeys(Keys.CONTROL , "a");
		FullNameInoutField.sendKeys(Keys.CONTROL , "c");
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder ='Email Address']"));
		emailField.sendKeys(Keys.CONTROL, "v");
		FullNameInoutField.sendKeys(Keys.CONTROL, "a");
		
		//FullNameInoutField.sendKeys(Keys.BACK_SPACE);
		WebElement AdditionalDetails = driver.findElement(By.xpath("//textarea[contains(@name,'additional-details')]"));
		emailField.sendKeys(Keys.CONTROL , "c");
		AdditionalDetails.sendKeys(Keys.CONTROL, "v");
		
		
		
		
	}
	
	@Test
	public void keyActions() {
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		driver.manage().window().maximize();
		WebElement FullNameInputField = driver.findElement(By.xpath("//input[@placeholder ='Full name']"));
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder ='Email Address']"));
		WebElement AdditionalDetails = driver.findElement(By.xpath("//textarea[contains(@name,'additional-details')]"));
		FullNameInputField.sendKeys("HelloWorld");
		
		WebElement btn = driver.findElement(By.xpath("//button[text() = 'Submit']"));
		Actions actions = new Actions(driver);
		
		actions.
		keyDown(FullNameInputField,Keys.CONTROL).
		sendKeys("a").
		sendKeys("c").
		keyUp(Keys.CONTROL)
		.perform();
		
		actions.
		keyDown(emailField,Keys.CONTROL).
		sendKeys("v")
		.perform();
		
		
		actions.
		keyDown(AdditionalDetails,Keys.CONTROL).
		sendKeys("v").
		keyUp(Keys.CONTROL)
		.click(btn)
		.perform();
	}

}
