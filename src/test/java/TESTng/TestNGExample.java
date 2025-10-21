package TESTng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
	
	WebDriver driver = new ChromeDriver(); 
	@BeforeClass
	public void sampleMethod() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("opened WebSite");
		
	}
	
	@Test(priority = 0)
	public void login() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		System.out.println("Login Succes full");
		
	}
	
	@AfterTest
	public void Method() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		Assert.assertTrue(ele.isDisplayed());
		System.out.println("Opened DashBoard");
		
		
	}
	
	

}
