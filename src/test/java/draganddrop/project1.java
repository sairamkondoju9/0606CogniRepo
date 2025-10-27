//package draganddrop;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.Color;
//
//
//public class project1 {
//	@Test
//	public void main() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://v1.training-support.net/selenium/target-practice");
//		String element = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
//		System.out.println(element);
//		//getCssValue("color");
//		
//		WebElement element2 = driver.findElement(By.xpath("//h5[text()='Fifth header']"));
////		String name1 = element2.getCssValue("color");
////		
////		String dd = Color.fromString(name1).asHex();
////		String dd1 = getColorNameFromHex(dd);
////		System.out.println(dd1);
//		String text = element2.getText();
//		String cssColor = element2.getCssValue("color");
//		String colorName = getColorNameFromTextAndCss(text, cssColor);
//		System.out.println("Color name: " + colorName);
//		
//	}
//	
//
//}
