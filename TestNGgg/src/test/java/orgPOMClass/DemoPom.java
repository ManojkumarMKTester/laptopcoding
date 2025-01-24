package orgPOMClass;

import org.BaseClass.BaseClasss;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPom extends BaseClasss{

	public DemoPom(){
		
		PageFactory.initElements(driver, this);
			
		}	
		
	

	    @FindBy(id = "firstname")
	    private WebElement firstNameInput;

	    @FindBy(id = "lastname")
	    private WebElement lastNameInput;

	    @FindBy(id = "userName")
	    private WebElement userNameInput;

	    @FindBy(id = "password")
	    private WebElement passwordInput;
	    
	    @FindBy(css = ".recaptcha-checkbox-checkmark")
	    private WebElement recaptchaCheckbox;


		@FindBy(id = "register")
	    private WebElement registerButton;

		public WebElement getFirstNameInput() {
			return firstNameInput;
		}

	    
		public WebElement getRecaptchaCheckbox() {
			return recaptchaCheckbox;
		}


		public WebElement getLastNameInput() {
			return lastNameInput;
		}

		public WebElement getUserNameInput() {
			return userNameInput;
		}

		public WebElement getPasswordInput() {
			return passwordInput;
		}

		public WebElement getRegisterButton() {
			return registerButton;
		}

	   

	 
	    
	}
	
	
	
	
