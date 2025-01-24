package org.flp;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;

public class Flipkart {

    private WebDriver driver;

   
    @Test
    public void TestCase1() throws InterruptedException {
    	WebDriver driver = new EdgeDriver();

        // Launch Flipkart website
        driver.get("https://www.flipkart.com/");
        WebElement findElement = driver.findElement(By.className("_2SmNnR"));
        findElement.sendKeys("iphone");
        // Auto-suggestion UL Xpath
        List<WebElement> findElements = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));

        // Print auto-suggestions
        for (WebElement suggestion : findElements) {
            System.out.println(suggestion.getText());
        }
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }

    // Define Browserlaunch, urlLaunch, sendKeys methods here
}
