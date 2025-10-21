package draganddrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
	@Test
	public void dragAndDrop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/drag-drop");
		WebElement ball = driver.findElement(By.id("ball"));
		WebElement targetOne = driver.findElement(By.id("dropzone1"));
		int widthOfTargetOne = targetOne.getLocation().getX();
		int heightOfTargetOne = targetOne.getLocation().getY();
		int ballWidth = ball.getLocation().getX();
		int ballHeight = ball.getLocation().getY();
		
		int widthOffSetX = widthOfTargetOne - ballWidth;
		int heightOffSetY = heightOfTargetOne - ballHeight;
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(ball).moveByOffset(widthOffSetX, heightOffSetY).release().perform();
		
		
		WebElement targetTwo = driver.findElement(By.id("dropzone2"));
		int widthOfTargetTwo = targetTwo.getLocation().getX();
		int heightOfTargetTwo = targetTwo.getLocation().getY();
		int ballWidthTwo = ball.getLocation().getX();
		int ballHeightTwo = ball.getLocation().getY();
		
		int widthOffSetXTwo = widthOfTargetTwo - ballWidthTwo;
		int heightOffSetYTwo = heightOfTargetTwo - ballHeightTwo;
		
		
		actions.clickAndHold(ball).moveByOffset(widthOffSetXTwo, heightOffSetYTwo).release().perform();
	}
}
