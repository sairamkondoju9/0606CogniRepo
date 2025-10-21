package draganddrop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class MiniProject {
    @Test
    public void mini() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Click on Advanced Search
        WebElement advanced = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'ebayadvsearch')]")));
        advanced.click();

        // Enter search keyword
        WebElement input1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_nkw")));
        input1.sendKeys("outdoor toys");

        // Select category
        WebElement input2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='s0-1-19-4[0]-7[3]-_sacat']")));
        new Select(input2).selectByVisibleText("Toys & Hobbies");

        // Apply filters
        driver.findElement(By.name("LH_TitleDesc")).click();
        driver.findElement(By.xpath("//input[@data-testid='s0-1-19-6[4]-[0]-LH_ItemCondition']")).click();
        driver.findElement(By.xpath("//input[@data-testid='s0-1-19-5[5]-[0]-LH_FR']")).click();
        driver.findElement(By.xpath("//input[@data-testid='s0-1-19-5[5]-[1]-LH_RPA']")).click();
        driver.findElement(By.xpath("//input[@data-testid='s0-1-19-6[7]-[3]-LH_PrefLoc']")).click();

        // Scroll and click Search button using JavaScript
        WebElement searchBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/main/form/div[2]/button")));
        js.executeScript("arguments[0].scrollIntoView(true);", searchBtn);
        Thread.sleep(1000); // Let scroll settle
        js.executeScript("arguments[0].click();", searchBtn);

        // Wait for results to load
        Thread.sleep(5000);

        // Print all <a> links
        List<WebElement> initialLinks = driver.findElements(By.xpath("//ul[@class='srp-results srp-grid clearfix']/li/descendant::div/child::a[@class='image-treatment']"));
        for (WebElement link : initialLinks) {
            String href = link.getAttribute("href");
            System.out.println(href);
        }
        List<WebElement> itemNames = driver.findElements(By.xpath("//ul[@class='srp-results srp-grid clearfix']/li/descendant::div/child::a[@class='su-link']/descendant::span[1]"));
        System.out.println("Total <a> links found on the page: " + initialLinks.size());

        // Prepare Excel workbook
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Toys Results");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Item Name");
        headerRow.createCell(1).setCellValue("Item Link");

        int rowNum = 1;

        // Extract item titles and links
//        List<WebElement> itemTitleElements = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
//        List<WebElement> itemLinks = driver.findElements(By.xpath("//a[@class='s-item__link']"));

        //System.out.println("\nTotal item titles found: " + itemTitleElements.size());

//        int count = Math.min(itemTitleElements.size(), itemLinks.size());
        for (int i = 0; i < initialLinks.size(); i++) {
            //String itemTitle = itemTitleElements.get(i).getText();
        	String itemTitle=itemNames.get(i).getText();
            String itemHref = initialLinks.get(i).getAttribute("href");

         
                System.out.println("MATCH FOUND (Name: " + itemTitle + ", Link: " + itemHref + ")");
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(itemTitle);
                row.createCell(1).setCellValue(itemHref);
            
        }

        // Write to Excel
        try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\2440606\\OneDrive - Cognizant\\Desktop\\MiniprojectWork.xlsx")) {
            workbook.write(fileOut);
            System.out.println("\nSuccessfully wrote " + (rowNum - 1) + " matching results to MiniprojectWork.xlsx");
        } catch (IOException e) {
            System.out.println("Error writing Excel file: " + e.getMessage());
            throw e;
        } finally {
            workbook.close();
        }

    }
}
