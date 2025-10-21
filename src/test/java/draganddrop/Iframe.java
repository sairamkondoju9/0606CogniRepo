package draganddrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
@Test
public void iframe(){
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://training-support.net/webelements/iframes");
	driver.manage().window().maximize();
	
	WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Frame1']"));
	
	driver.switchTo().frame(iframe);

	WebElement button = driver.findElement(By.xpath("//button[text()='Click me!']"));
	
    button.click();
    
    
    driver.switchTo().defaultContent();
    
    WebElement iframe2 = driver.findElement(By.xpath("//iframe[@title='Frame2']"));
    
	driver.switchTo().frame(iframe2);
	
	
	
	WebElement button2 = driver.findElement(By.xpath("//button[text()='Click me!']"));
	
	
    button2.click();
   
	
    
    
    
	
}
}
