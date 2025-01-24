package junitts;

	import static org.junit.Assert.assertTrue;

import org.base.BaseClasss;
import org.junit.*;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class Junitss extends BaseClasss {

	    public static  WebDriver driver;

	    @BeforeClass
	    public  static void setup() throws InterruptedException {
	    	Browserlaunch("edge");
	    	Thread.sleep(20);
	       
	    }
	    @Before
	    public void before() {
	    	System.out.println("before class");
		}
		@After
		public void aftertest() {
		System.out.println("After class");
		}
	    @Test
	    public   void testLogin1() {
	    	driver.get("https://www.facebook.com/");
//	    	String currentUrl = driver.getCurrentUrl();
//	    	boolean contains = currentUrl.contains("Facebook");
//	    	assertTrue(contains);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
//	     driver.get("https://www.facebook.com/");
//	    WebElement email = driver.findElement(By.id("email"));
//	    WebElement password = driver.findElement(By.id("pass"));
//	    email.sendKeys("Manoj");
//	    password.sendKeys("123456");
//    	System.out.println("login");

	      
	    }
	    
	    @Test
	    public  void testSignUp2() throws InterruptedException {
//	    	driver.get("https://www.facebook.com/");
//	    	 WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
//	 	    createAccountButton.click();
//	 	    Thread.sleep(3000);
//	        
//	        WebElement firstName = driver.findElement(By.name("firstname"));
//	        firstName.sendKeys("Mariappan");
//
//	        WebElement lastName = driver.findElement(By.name("lastname"));
//	        lastName.sendKeys("manoj");
//
//	        WebElement email = driver.findElement(By.name("reg_email__"));
//	        email.sendKeys("manojmariappan@gmail.com");
//
//	        WebElement password = driver.findElement(By.name("reg_passwd__"));
//	        password.sendKeys("123456");
//
//	        // Click on the sign-up button
//	        WebElement signUpButton = driver.findElement(By.name("websubmit"));
//	        signUpButton.click();
//
//	    	System.out.println("signup");
	    }

	    @AfterClass
	    public static void tearDown() {
	       
	        }
	    }
	

