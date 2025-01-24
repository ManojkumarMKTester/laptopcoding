package org.hotels;

import org.base.BaseClasss;
import org.demosite.GreensPOM;
import org.junit.*;
import org.junit.Test;

public class Greens extends BaseClasss {

	@Before
	public  void Brow() throws InterruptedException {
		
		Browserlaunch("edge");
		Thread.sleep(2000);

	}
	
	// Question 2 Note 1: Scroll UP & Scroll Down
	@Test 
	public void Greenstech() throws InterruptedException {
		urlLaunch("http://www.greenstechnologys.com/");
		
		GreensPOM g=new GreensPOM();
		scrollToElement(g.getDown());
		Thread.sleep(3000);
		scrollToElementup(g.getUp());
		Thread.sleep(3000);
		//scroolup and printtext
		System.out.println("---------FirstLine Text----------");
		gettext(g.getPrint());
		
		//scrolldown printtext
		System.out.println("LastLine Text");
		 gettext(g.getLast());
		
		
	}
	
	
	
	
	
}
