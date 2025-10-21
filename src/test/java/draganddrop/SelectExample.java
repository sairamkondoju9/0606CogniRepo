package draganddrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
	@Test
	public void multiple() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/selects");
		WebElement mult = driver.findElement(By.xpath("//select[@multiple]"));//Selects
		 //WebElement title = driver.findElement(By.xpath("//h1[text()='Selects']"));
//By.cssSelector(".text-5xl.font-bold.text-center.text-black.lg\\:text-6xl.font-display")
	        // Print the title text
	        System.out.println(driver.getTitle());
		
		Select select = new Select(mult);
		select.selectByValue("rust");
		select.selectByVisibleText("JavaScript");
		select.selectByIndex(3);
		select.selectByIndex(4);
		select.selectByIndex(5);
		select.selectByValue("nodejs");
		select.deselectByIndex(4);
		
		
		
		
		
		}

}
