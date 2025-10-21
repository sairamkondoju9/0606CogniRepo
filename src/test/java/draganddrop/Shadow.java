package draganddrop;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow {
    WebDriver driver;

    @Test
    public void open() {
        driver = new ChromeDriver();
        driver.get("https://training-support.net/webelements/login-form");
    }

    @Test(dependsOnMethods = {"open"})
    public void loginTest() {
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        username.sendKeys("admin");
        password.sendKeys("password");
        loginButton.click();
    }

    @Test(dependsOnMethods = {"loginTest"})
    public void close() {
        driver.quit();
    }
}
