package org.step;

import java.time.Duration;

import org.base.BaseClasss;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClasss {
	WebDriver driver;

@Given("To User Should be in Home Page Of Well.ca Application")
public void to_User_Should_be_in_Home_Page_Of_Well_ca_Application() throws InterruptedException {
//	WebDriverManager.edgedriver().setup();
//    driver =new EdgeDriver();
 Thread.sleep(3000);
 driver.get("https://well.ca");
	
	//urlLaunch("https://well.ca/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@Given("The User Can Click the Signin\\/Register button")
public void the_User_Can_Click_the_Signin_Register_button() {
    WebElement signbtn = driver.findElement(By.id("link_login_form"));
    signbtn.click();
}


@When("The User Can Enter Invalid Email and Password")
public void the_User_Can_Enter_Invalid_Email_and_Password() {
   WebElement email = driver.findElement(By.id("new-login-form__email"));
   email.sendKeys("manojkumar@gmail.com");
   WebElement pass = driver.findElement(By.id("new-login-form__password"));
   pass.sendKeys("Tirunelveli");
}

@Then("The User Can Click The SignIn button")
public void the_User_Can_Click_The_SignIn_button() {
	WebElement signbtn = driver.findElement(By.xpath("//*[text()='Sign In']"));
	signbtn.click();
	
	String expectedErrorMessage = "Invalid username or password."; // Expected error message
	WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"new-login-form__general-error\"]"));
	String actualErrorMessage = errorMessage.getText();

	// Validate the error message
	Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"The email or password you have entered is incorrect. If you have forgotten your password, please ");
	
	
}

}
