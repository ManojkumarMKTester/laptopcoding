package org.hotel;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends BaseClasss {
public Booking(){
		
		PageFactory.initElements(driver, this);
			
		}
	 @FindBy(id = "location")
	    private WebElement location;

	    @FindBy(id = "hotels")
	    private WebElement hotel;

	    @FindBy(id = "room_type")
	    private WebElement roomType;
	    
	    @FindBy(id = "Submit")
	    private WebElement submit;
	    
	    @FindBy(name = "radiobutton_0")
	    private WebElement searchroom;
	    
	    @FindBy(xpath = "//input[@name='continue']")
	    private WebElement continues;
	    
	    @FindBy(xpath = "//input[@id='order_no']")
	    private WebElement ord;
	    
	    @FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	    private WebElement booking;
	    
	    @FindBy(xpath = "//*[@id=\"order_id_text\"]")
	    private WebElement searchorder;
	    
	    @FindBy(id = "search_hotel_id")
	    private WebElement go;
	    
	    @FindBy(xpath = "//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input")
	    private WebElement btncl;
	    
	    @FindBy(xpath = "//*[@id=\"booked_form\"]/table/tbody/tr[3]/td/input[1]")
	    private WebElement cancelorder;
	    
	    @FindBy(xpath = "/html/body/table[2]")
	    private WebElement table2;
	    
	    
	  
		public WebElement getTable2() {
			return table2;
		}

		public WebElement getCancelorder() {
			return cancelorder;
		}

		public WebElement getBtncl() {
			return btncl;
		}

		public WebElement getGo() {
			return go;
		}

		public  WebElement getSearchorder() {
			return searchorder;
		}

		public WebElement getBooking() {
			return booking;
		}

		public WebElement getContinues() {
			return continues;
		}

		public WebElement getOrd() {
			return ord;
		}

		public WebElement continues() {
			return continues;
		}

		public WebElement getSubmit() {
			return submit;
		}

		public WebElement getSearchroom() {
			return searchroom;
		}

		public WebElement getLocation() {
			return location;
		}

		public WebElement getHotel() {
			return hotel;
		}

		public WebElement getRoomType() {
			return roomType;
		}

	
		public WebElement getSearchButton() {
			return submit;
		}

		}
