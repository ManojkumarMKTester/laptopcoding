package org.facebook;


import org.testng.Assert;
import  org.testng.Assert.*;

import static org.testng.Assert.*;

import org.BaseClass.BaseClasss;
import org.POMClasses.Loginpage;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;



public class FacebookLoginTest extends BaseClasss {

    @Test
    public void testFacebookLogin() {
    	 Browserlaunch("edge");
        // Navigate to Facebook login page
        driver.get("https://www.facebook.com/");
      
        // Verify whether the login is successful
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("?privacy_mutation_token"),"Login SucessFully");
      
        	System.out.println(); 
        	System.out.println("GitHub Processing");
        }
      
    }


    
