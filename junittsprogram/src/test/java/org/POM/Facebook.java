package org.POM;

import org.base.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class Facebook extends BaseClasss {

	@BeforeClass
	public static void Browser() {
		Browserlaunch("edge");
		urlLaunch("https://www.facebook.com/");
	}
	
	
	
	@Test
	public void login() {
		Loginpage l=new Loginpage();
		sendkeys(l.getTxtuser(), "Ramesh");
		sendkeys(l.getTxtpass(), "Manoj");

	}
	}
	

	
	
	
	
	
	
	
	
	
	
	

