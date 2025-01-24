package org.task;

import org.BaseClass.BaseClasss;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import orgPOMClass.Redbus;

public class RedBusApp extends BaseClasss {
	



	    @BeforeMethod
	    public void setUp() {
	        Browserlaunch("edge");
	    }

	    @Test
	    public void testSignUp() {
	        driver.get("https://www.redbus.in/");
	        Redbus r=new Redbus();
	        
	        click(r.getSignUpButton());
	        sendkeys(r.getMobileNumberInput(), "7545893256");
	        SoftAssert s= new SoftAssert();
	        String mn = getattribute(r.getMobileNumberInput());                                             

	        s.assertTrue(mn.contains("7545893256"),"Verify MObile no");
	    }

	    @AfterMethod
	    public void tearDown() {
	        
	        System.out.println("=============Sucess============");
	    }
	}



