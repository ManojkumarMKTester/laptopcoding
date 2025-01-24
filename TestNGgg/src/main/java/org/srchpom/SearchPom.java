package org.srchpom;

import org.BaseClass.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPom extends BaseClasss {
	public SearchPom(){
		
		PageFactory.initElements(driver, this);
			
		}
	@FindBy(xpath="//input[@title='Search for Products, Brands and More']")
	private WebElement searchBox;
	
	@FindBy(xpath="//span[@class='_10Ermr']")
	private WebElement findElement;
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	private WebElement productElements;
	
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	private WebElement priceofpro;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getFindElement() {
		return findElement;
	}

	public<List> WebElement getProductElements() {
		return productElements;
	}

	public <List>WebElement getPriceofpro() {
		return priceofpro;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

