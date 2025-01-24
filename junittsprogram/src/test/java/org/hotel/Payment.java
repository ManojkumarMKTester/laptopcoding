package org.hotel;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment extends BaseClasss {
public Payment(){
		
		PageFactory.initElements(driver, this);
			
		}
	@FindBy(name = "first_name")
    private WebElement firstName;

    @FindBy(name = "last_name")
    private WebElement lastName;

    @FindBy(name = "address")
    private WebElement address;

    @FindBy(name = "cc_num")
    private WebElement creditCardNumber;

    @FindBy(name = "cc_type")
    private WebElement creditCardType;

    @FindBy(name = "cc_exp_month")
    private WebElement creditCardExpirationMonth;

    @FindBy(name = "cc_exp_year")
    private WebElement creditCardExpirationYear;

    @FindBy(name = "cc_cvv")
    private WebElement creditCardCvv;
    
    @FindBy(name = "book_now")
    private WebElement book;
    
    @FindBy(name = "my_itinerary")
    private WebElement mybook;
    
    @FindBy(id = "order_id_1212373")
    private WebElement ord;

    
  
    

	public WebElement getOrd() {
		return ord;
	}

	public WebElement getMybook() {
		return mybook;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getCreditCardExpirationMonth() {
		return creditCardExpirationMonth;
	}

	public WebElement getCreditCardExpirationYear() {
		return creditCardExpirationYear;
	}

	public WebElement getCreditCardCvv() {
		return creditCardCvv;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	@FindBy(name = "book_now")
    private WebElement bookNowButton;


}
