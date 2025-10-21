package draganddrop;


import org.openqa.selenium.chrome.ChromeDriver;

public class opencart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		String act_title = driver.getTitle();
		if(act_title.equals("Drag & Drop")) {
			System.out.println("TEST PASSED");
		}
		else
		{
			System.out.println("NOT PASSED");
		}
		
	}

}
