package org.hotels;

import java.io.IOException;

import org.base.BaseClasss;
import org.demosite.DemoPom;
import org.junit.*;


public class DemositeReg extends BaseClasss {
	@Before
    public void setUp() {
 
Browserlaunch("edge");
urlLaunch("https://demoqa.com/register");
       
    }
	
	@Test
	public void Register() throws InterruptedException, IOException {
		DemoPom k=new DemoPom();
		//Using DataDriven Excel data
		sendkeys(k.getFirstNameInput(),exceldata("Book1", "sheet1", 3, 0));
		sendkeys(k.getLastNameInput(), exceldata("Book1", "sheet1", 3, 1));
		sendkeys(k.getUserNameInput(), exceldata("Book1", "sheet1", 3, 2));
		sendkeys(k.getPasswordInput(), exceldata("Book1", "sheet1", 3, 3));
		
		// USing POM
//		sendkeys(k.getFirstNameInput(),"Manojkumar");	
//		sendkeys(k.getLastNameInput(), "M");
//		sendkeys(k.getUserNameInput(), "manojkumar567");
//		sendkeys(k.getPasswordInput(), "9879545");
//		Thread.sleep(2000);
//		
		click(k.getRegisterButton());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
