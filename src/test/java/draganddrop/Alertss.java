package draganddrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss {
@Test
public void alertsExample(){
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://training-support.net/webelements/alerts");
//	WebElement simp = driver.findElement(By.id("simple"));
//	simp.click();
//	Alert alert = driver.switchTo().alert();
//	alert.accept();
	
//	WebElement confirm = driver.findElement(By.id("confirmation"));
//	confirm.click();
//	Alert alert = driver.switchTo().alert();
//	alert.accept();
	
	
	WebElement prompt = driver.findElement(By.id("prompt"));
	prompt.click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Hello World");
	alert.accept();
	
	
}
}
