package org.task;

import org.testng.Assert;
import  org.testng.Assert.*;

import static org.testng.Assert.*;

import org.BaseClass.BaseClasss;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import orgPOMClass.Loginpage;

public class FacebookLoginTest extends BaseClasss {

    @Test
    public void testFacebookLogin() {
    	 Browserlaunch("edge");
        // Navigate to Facebook login page
        driver.get("https://www.facebook.com/");

        SoftAssert s= new SoftAssert();
        // Enter username and password
        Loginpage l=new Loginpage();
        
        sendkeys(l.getTxtuser(),"Surya" );
         String user = getattribute(l.getTxtuser());
        s.assertEquals(user.contains("Surya"), "Verify UserNamr");
        
        sendkeys(l.getTxtpass(),"Manojkumar12");
        String pass = getattribute(l.getTxtpass());
        s.assertTrue(pass.contains("Manojkumar12"),"Verify Password");

        // Click on the login button
       
        click(l.getLogin());

        // Wait for the page to load
        try {
            Thread.sleep(5000); // Adjust the wait time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify whether the login is successful
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("?privacy_mutation_token"),"Login SucessFully");
      
        	System.out.println(); 
        }
      
    }


    
