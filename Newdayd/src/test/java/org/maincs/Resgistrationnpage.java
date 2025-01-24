package org.maincs;

import java.awt.List;

import org.Browser.Childclass;
import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Resgistrationnpage extends BaseClasss {
	
	 @FindBy(name = "firstname")
    private WebElement firstNameInput;

    @FindBy(name = "lastname")
    private WebElement lastNameInput;

    @FindBy(name = "reg_email__")
    private WebElement emailInput;

    @FindBy(name = "reg_passwd__")
    private WebElement passwordInput;

    @FindBy(name = "birthday_day")
    private WebElement birthdayDayDropdown;

    @FindBy(name = "birthday_month")
    private WebElement birthdayMonthDropdown;

    @FindBy(name = "birthday_year")
    private WebElement birthdayYearDropdown;
    
    @FindAll({
            @FindBy(xpath = "//input[@type='radio' and @name='sex']"),
            @FindBy(xpath = "//input[@type='radio' and @name='gender']")})
    private List genderRadioButtons;

    @FindAll({
            @FindBy(name = "preferred_pronoun"),
            @FindBy(name = "custom_gender")})
    private List customGenderDropdown;

    public WebElement getFirstNameInput() {
		return firstNameInput;
	}

	public WebElement getLastNameInput() {
		return lastNameInput;
	}

	public WebElement getEmailInput() {
		return emailInput;
	}


	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getBirthdayDayDropdown() {
		return birthdayDayDropdown;
	}

	public WebElement getBirthdayMonthDropdown() {
		return birthdayMonthDropdown;
	}

	public WebElement getBirthdayYearDropdown() {
		return birthdayYearDropdown;
	}

	public List getGenderRadioButtons() {
		return genderRadioButtons;
	}

	public List getCustomGenderDropdown() {
		return customGenderDropdown;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	@FindBy(name = "websubmit")
    private WebElement signUpButton;
	
		
	
	
	
	
	
	
	
	
}
