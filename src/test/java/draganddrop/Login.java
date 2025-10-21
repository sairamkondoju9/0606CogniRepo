package draganddrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login  extends BaseClass{


	@BeforeClass
	public void setUp() {
		
		driver.get("https://training-support.net/webelements/login-form");
	}
	@Test
	public void openTwo() {
      driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("password123");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		
		String res = driver.findElement(By.tagName("h2")).getText();
		Assert.assertNotEquals(res, "Welcome Back, Admin!");
	}

}
