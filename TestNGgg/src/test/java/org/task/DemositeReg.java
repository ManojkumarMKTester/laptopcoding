package org.task;

import java.io.IOException;

import org.BaseClass.BaseClasss;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import orgPOMClass.DemoPom;


public class DemositeReg extends BaseClasss {
	@BeforeMethod
    public void setUp() {
 
Browserlaunch("edge");
urlLaunch("https://demoqa.com/register");
       
    }
	
	@Test
	public void Register() throws InterruptedException, IOException {
		DemoPom k=new DemoPom();
		SoftAssert s= new SoftAssert();
		//Using DataDriven Excel data
//		sendkeys(k.getFirstNameInput(),exceldata("Book1", "sheet1", 3, 0));
//		
//		String fname = getattribute(k.getFirstNameInput());
//        s.assertTrue(fname.contains("Ramesh"),"Verify name");
//        
//		sendkeys(k.getLastNameInput(), exceldata("Book1", "sheet1", 3, 1));
//		
//		String lname = getattribute(k.getLastNameInput());
//        s.assertTrue(lname.contains("R"),"Verify lastname");
//        
//		sendkeys(k.getUserNameInput(), exceldata("Book1", "sheet1", 3, 2));
//		
//		String usr = getattribute(k.getFirstNameInput());
//        s.assertTrue(usr.contains("RameshDrago1"),"Verify usrname");
//        
//		sendkeys(k.getPasswordInput(), exceldata("Book1", "sheet1", 3, 3));
		
		String pass = getattribute(k.getFirstNameInput());
        s.assertTrue(pass.contains("34565"),"Verify password");
        
		// USing POM
		sendkeys(k.getFirstNameInput(),"Manojkumar");
        String fname = getattribute(k.getFirstNameInput());
        s.assertTrue(fname.contains("Manojkumar"),"Verify name");
        
		sendkeys(k.getLastNameInput(), "M");
        String lname = getattribute(k.getLastNameInput());
        s.assertTrue(lname.contains("M"),"Verify lastname");
        
		sendkeys(k.getUserNameInput(), "manojkumar567");
        String usr = getattribute(k.getFirstNameInput());
        s.assertTrue(usr.contains("manojkumar567"),"Verify usrname");
        
//		sendkeys(k.getPasswordInput(), "9879545");
//		Thread.sleep(2000);
//		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
