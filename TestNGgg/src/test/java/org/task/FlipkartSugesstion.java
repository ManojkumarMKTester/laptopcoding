package org.task;

import java.util.List;

import org.BaseClass.BaseClasss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.srchpom.SearchPom;
import org.testng.annotations.Test;

public class FlipkartSugesstion extends BaseClasss {

	@Test
	private void TestCase1() throws InterruptedException {
		Browserlaunch("edge");
		SearchPom s=new SearchPom();
		
		urlLaunch("https://www.flipkart.com/");
		// Search for iPhones
	    sendkeys(s.getSearchBox(), "Mobile");
	   
//AutoSugesstion UList Xpath
	 List<WebElement> findElements = driver.findElements(By.className("_3D0G9a"));
//System.out.println("Flipkart Sugessed Products");
for(WebElement Product : findElements ) {
	System.out.println(Product.getText());       
	}
}}