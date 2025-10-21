package draganddrop;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Goibibo {
public static void main(String[] args) {
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.goibibo.com/flights/?utm_source=bing&utm_medium=cpc&utm_campaign=DF-Brand");

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='logSprite icClose']"))).click();

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class = 'sc-jlwm9r-1 ewETUe']"))).click();

WebElement froms = driver.findElement(By.xpath("//p[contains(text(),'Enter city or airport')]"));
froms.click();

WebElement typee= driver.findElement(By.xpath("//input[@type = 'text']"));
typee.sendKeys("Hyderabad");

List<WebElement> fromOptions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='autoSuggest-list']/li")));

System.out.println("fromOptions");
for(WebElement opt : fromOptions)
{
	System.out.println(opt.getText());
}
fromOptions.get(0).click();

WebElement to = driver.findElement(By.xpath("//div[@class='sc-12foipm-25 fbAAhv']/input[@type='text']"));

to.sendKeys("chennai");
to.click();






}
}