package org.add;


import org.BaseClass.BaseClasss;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlSuggestion extends BaseClasss {
			public static void main(String[] args) {
				
		
				Browserlaunch("edge");
			       
		
            // Open Flipkart
            driver.get("https://www.flipkart.com");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            
            // Find the search box and enter 'iPhone'
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("iPhone");
            searchBox.sendKeys(Keys.RETURN);
            
            String autosuggestionXPath = "//div[@class='IIdQZO _1R0K0g']//div[contains(@class, '_3pLy-c row')]";
            List<WebElement> autosuggestions = driver.findElements(By.xpath(autosuggestionXPath));

            for (WebElement autosuggestion : autosuggestions) {
                System.out.println(autosuggestion.getText());
            }
    }
    }

