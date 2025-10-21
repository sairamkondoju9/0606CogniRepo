package draganddrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiee {
	@Test
	public void cook() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements");
		Cookie cookie = new Cookie.Builder("test", "asdfgh")
				.domain("training-support.net")
				.path("/webelements")
				.build();
		
		driver.manage().addCookie(cookie);
		Thread.sleep(3000);
		System.out.println(driver.manage().getCookieNamed("test"));
	}

}
