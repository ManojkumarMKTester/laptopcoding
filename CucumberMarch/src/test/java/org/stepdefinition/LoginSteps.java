package org.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.base.BaseClasss;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClasss {
	@Given("To User Should be in Home Page Of Lazada Application")
	public void to_User_Should_be_in_Home_Page_Of_Lazada_Application() {
		Browserlaunch("edge");
	    urlLaunch("https://www.lazada.sg/");
	    ImplicitWait(5000);
	}

	@Given("The User Can Click the Signin\\/Register button")
	public void the_User_Can_Click_the_Signin_Register_button() {
	    WebElement sign = driver.findElement(By.id("anonLogin"));
	    click(sign);
	}

	@When("The User Can Enter Invalid Email and Password")
	public void the_User_Can_Enter_Invalid_Email_and_Password(DataTable table) throws InterruptedException {
	    List<String> list = table.asList();
	    
	    
	    WebElement phone = driver.findElement(By.xpath("//input[@type='password']"));
	    sendkeys(phone, list.get(3));
	    Thread.sleep(3000);
	    
	    WebElement email = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div/div[2]/div/input"));
	    sendkeys(email, list.get(2));
	}

	@Then("The User Can Click The SignIn button")
	public void the_User_Can_Click_The_SignIn_button() {
	   WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div/div[4]/button\r\n"));
	    click(login);
	    
//	    String att = getattribute(login);
	    ImplicitWait(6000);
	    WebElement err = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]\r\n" ));
	    boolean dis = err.isDisplayed();

	    String expectedErrorMessage = "Please enter a valid phone number."; // Adjust this as per the actual error message
        String actualErrorMessage = err.getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Please enter a valid phone number.");
System.out.println("Enter Valid Password & Number ");
	}

}
