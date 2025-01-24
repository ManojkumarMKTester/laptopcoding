package org.hotel;
import org.base.BaseClasss;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClasss {
	public Login(){
		
		PageFactory.initElements(driver, this);
			
		}
	    // Locators using @FindBy annotation
	  @FindBy(id = "username")
	    private WebElement usernameField;

	    @FindBy(name = "password")
	    private WebElement passwordField;

	    @FindBy(name = "login")
	    private WebElement loginButton;

		public WebElement getUsernameField() {
			return usernameField;
		}

		public WebElement getPasswordField() {
			return passwordField;
		}

		public WebElement getLoginButton() {
			return loginButton;
			
		}

	   

	   
	    }
	


