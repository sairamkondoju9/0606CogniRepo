package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program11 {
public static void main(String args[]) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement search = driver.findElement(By.xpath("//svg[@role='img' and @xmlns='http://www.w3.org/2000/svg']/following-sibling::style"));
	if(search.isDisplayed()) {
		System.out.println("TRUE");
	}
	else {
		System.out.println("FALSE");
	}
	driver.quit();
}
}
