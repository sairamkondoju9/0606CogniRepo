package draganddrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTwo  extends BaseClass{

	@BeforeClass
	
	public void open() {
		driver.get("https://training-support.net/webelements/login-form");
	}
	@Test
	public void correct() {
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(4));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h2"), "Welcome Back, Admin!"));
		String res = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(res, "Welcome Back, Admin!");		

		
	}
}
