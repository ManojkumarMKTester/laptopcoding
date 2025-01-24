package orgPOMClass;

import org.BaseClass.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Loginpage extends BaseClasss {
	
	
public Loginpage(){
		
	PageFactory.initElements(driver, this);
		
	}	
	
	@FindBy(id="email")
	private WebElement txtuser;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(id="reg_pages_msg")
	private WebElement btn;
	
	public WebElement getBtn() {
		return btn;
	}
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
	

}
