package org.hotels;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.base.BaseClasss;
import org.hotel.Booking;
import org.hotel.ExcelWriter;
import org.hotel.Login;
import org.hotel.Payment;
import org.hotel.Register;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adactinhotel extends BaseClasss {

	private WebDriver driver;
    @Before
    public void setUp() {
        // Set the path to chromedriver
    	Browserlaunch("edge");
        // Initialize WebDriver
       
    }

    @Test
    public void testLoginButtonClick() throws InterruptedException, AWTException, IOException, InvalidFormatException {
        // Open the website
       urlLaunch("https://adactinhotelapp.com/index.php");
        Thread.sleep(2000);
        
  //      urlLaunch("https://adactinhotelapp.com/Register.php");
//        Register r=new Register();
//        sendkeys(r.getUsernameInput(),"manojkumar5209");
//        sendkeys(r.getPasswordInput(), "manojkumar");
//        sendkeys(r.getConfirmPasswordInput(), "manojkumar");
//        sendkeys(r.getFullname(), "manojkumar");
//        sendkeys(r.getEmail(), "manijkumarkanagu1@gmail.com");
//        Thread.sleep(9000);
//        click(r.getCheck());
//        click(r.getReg());
//       
        
        
        
        
        
        
        
        
        
        
        
        
        
//       
//        //Login Page
        Login k=new Login();
        
        sendkeys(k.getUsernameField(), "manojkumar5209");
        sendkeys(k.getPasswordField(), "manojkumar");
        click(k.getLoginButton());
        Thread.sleep(2000);

//        
//        //Hotel search Page
        Booking b=new Booking();
//        selectByVisibleText(b.getLocation(), "London");
//        selectByVisibleText(b.getHotel(), "Hotel Creek");
//        selectByIndex(b.getRoomType(), 2);
//        click(b.getSubmit());
//        Thread.sleep(2000);
//
//        
//        //Hotel Select
//        click(b.getSearchroom());
//        click(b.continues());
//        Thread.sleep(2000);
//        
//        //Payemnt page
        Payment p=new Payment();
//        sendkeys(p.getFirstName(), "Manojkumar");
//        sendkeys(p.getLastName(), "Mariappan");
//        sendkeys(p.getAddress(), "23A/2 Sankarenkovil,Tenkasi,Tamilnadu");
//        sendkeys(p.getCreditCardNumber(), "1234567898765432");
//        sendkeys(p.getCreditCardCvv(), "004");
//        
//        
//        selectByIndex(p.getCreditCardType(), 1);
//        selectByVisibleText(p.getCreditCardExpirationMonth(), "May");
//        selectByIndex(p.getCreditCardExpirationYear(), 2);
//        
//        click(p.getBook());
//        Thread.sleep(3000);
//       
//        
//        ImplicitWait(8000);
//        
//        
//        //Booking ID IS
//        
//        System.out.println("========Order ID ============");
//        String bookingId = b.getOrd().getAttribute("value");
//        System.out.println(bookingId);
//        
//        //Click  Booked Itinerary
//	        click(b.getBooking());
//	       sendkeys(b.getSearchorder(), bookingId);
//	       click(b.getGo());
//	       click(b.getBtncl());
//	       click(b.getCancelorder());
//	       
//	       acceptAlert();
//	       
//	       sendkeys(b.getSearchorder(), bookingId);
//	       click(b.getGo());
	       
        
        
        // Hotel Room Booking Using Excel (DataDriveen)
	       
	       selectByVisibleText(b.getLocation(), exceldata("Book1", "sheet3", 1, 0));
	       selectByVisibleText(b.getHotel(), exceldata("Book1", "sheet3", 1, 1));
	       selectByVisibleText(b.getRoomType(), exceldata("Book1", "sheet3", 1, 2));
	       
	       click(b.getSubmit());
           Thread.sleep(2000);
	       click(b.getSearchroom());
	        click(b.continues());
	        Thread.sleep(2000);

	       sendkeys(p.getFirstName(),exceldata("Book1", "sheet3", 1,3));
	       sendkeys(p.getLastName(), exceldata("Book1", "sheet3", 1,4));
	       sendkeys(p.getAddress(), exceldata("Book1", "sheet3", 1,5));
	       sendkeys(p.getCreditCardNumber(), exceldata("Book1", "sheet3", 1,6));
	       sendkeys(p.getCreditCardType(), exceldata("Book1", "sheet3", 1, 7));
	       sendkeys(p.getCreditCardExpirationMonth(), exceldata("Book1", "sheet3", 1,8));
	       sendkeys(p.getCreditCardExpirationYear(), exceldata("Book1", "sheet3", 1,9));
	       sendkeys(p.getCreditCardCvv(), exceldata("Book1", "sheet3", 1,10));
	       
	       click(p.getBook());
	        Thread.sleep(3000);
	        
	        ImplicitWait(8000);
	       
	        System.out.println("========Order ID ============");
	        String bookingId = b.getOrd().getAttribute("value");
	        System.out.println(bookingId);

	        setCellValue("sheet3", 1, 12, bookingId, "Book1");
	        
	        
	        System.out.println("Order Id Write Excel sucessfully");
	       
	       
    }
    
   
}

    
