package orgPOMClass;

import org.BaseClass.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends BaseClasss {
	
public Register(){
		
		PageFactory.initElements(driver, this);
			
		}
@FindBy(name = "username")
private WebElement usernameInput;

@FindBy(name = "password")
private WebElement passwordInput;

@FindBy(name = "re_password")
private WebElement confirmPasswordInput;


@FindBy(name = "full_name")
private WebElement fullname;

@FindBy(name = "email_add")
private WebElement email;

@FindBy(name = "captcha")
private WebElement captcha;

@FindBy(name = "tnc_box")
private WebElement check;

@FindBy(name = "Submit")
private WebElement reg;

public WebElement getUsernameInput() {
	return usernameInput;
}

public WebElement getPasswordInput() {
	return passwordInput;
}

public WebElement getConfirmPasswordInput() {
	return confirmPasswordInput;
}

public WebElement getFullname() {
	return fullname;
}

public WebElement getEmail() {
	return email;
}

public WebElement getCaptcha() {
	return captcha;
}

public WebElement getCheck() {
	return check;
}

public WebElement getReg() {
	return reg;
}


	

}
