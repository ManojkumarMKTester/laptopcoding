package orgPOMClass;
import org.BaseClass.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redbus extends BaseClasss{

	public Redbus(){
		
		PageFactory.initElements(driver, this);
			
		}

	@FindBy(id = "new-sign-up")
    private WebElement signUpButton;

    @FindBy(id = "mobileNoInp")
    private WebElement mobileNumberInput;

    @FindBy(id = "signUpPassword")
    private WebElement passwordInput;

    @FindBy(id = "emailInp")
    private WebElement emailInput;

    @FindBy(id = "signUpSubmitBtn")
    private WebElement submitButton;


	    public WebElement getSignUpButton() {
		return signUpButton;
	}

	public WebElement getMobileNumberInput() {
		return mobileNumberInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getEmailInput() {
		return emailInput;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	    

	    }
	

	

