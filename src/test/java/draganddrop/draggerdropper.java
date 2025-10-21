package draganddrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class draggerdropper {
	@Test
	public void dropper() {
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
	
	driver.get("https://training-support.net/webelements/drag-drop");
	WebElement ball = driver.findElement(By.id("ball"));
	WebElement targetOne = driver.findElement(By.id("dropzone1"));
	WebElement targetTwo = driver.findElement(By.id("dropzone2"));
	int widthOfTragetOne = targetOne.getLocation().getX();
	int heightOfTargetOne = targetOne.getLocation().getY();
	int ballWidth = ball.getLocation().getX();
	int ballHeight = ball.getLocation().getY();
	
	
	int widthOffSetX = widthOfTragetOne - ballWidth;
	int heightOffSetY = heightOfTargetOne - ballHeight;
	Actions action = new Actions(driver);
	action.clickAndHold(ball).moveByOffset(widthOffSetX,heightOffSetY ).release().perform();
	
	}
	
	
	
	
}
