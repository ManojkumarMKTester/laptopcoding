package org.task;

import org.BaseClass.BaseClasss;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

public class Greens extends BaseClasss {

	@Test
	private void Testing() {
		urlLaunch("http://www.greenstechnologys.com/");
		System.out.println("Website open both edge & Chrome ");
	}
	
}
