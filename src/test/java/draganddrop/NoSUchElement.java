package draganddrop;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSUchElement {
	
	
	

	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://training-support.net");

	        // This element does NOT exist on the page
	        try{

	        driver.switchTo().alert().accept();

	       }
catch(NoAlertPresentException e){
System.out.println("NO ALERT "+e.getMessage());




	    }
finally{
driver.quit();
	
}
}
}
