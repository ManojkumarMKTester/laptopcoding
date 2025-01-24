package org.task;

import org.BaseClass.BaseClasss;
import org.testng.annotations.BeforeMethod;

public class Flipkart  extends BaseClasss{
	
	@BeforeMethod
    public void setUp() {
 
Browserlaunch("edge");
urlLaunch("https://demoqa.com/register");
       
    }
	

}
