package org.demosite;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPOM extends BaseClasss {
	public GreensPOM(){
		
		PageFactory.initElements(driver, this);
			
		}
	
	@FindBy(xpath="//p[text()=' and Realtime methodologies.']")
	private WebElement down;
	
	@FindBy(xpath="	//h1[text()='No 1 Software Training Institutes in Chennai with Placements']\r\n")
	private WebElement up;
	
	@FindBy(xpath="//h1[contains(text(),'No 1 Software Training Institutes')]")
	private WebElement print;
	
	@FindBy(xpath="//strong[contains(text(),'COMPLETE PRACTICAL')]")
	private WebElement last;
	

	public WebElement getLast() {
		return last;
	}

	public WebElement getPrint() {
		return print;
	}

	public WebElement getDown() {
		return down;
	}

	public WebElement getUp() {
		return up;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
