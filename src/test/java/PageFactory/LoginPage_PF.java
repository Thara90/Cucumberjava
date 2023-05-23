/*package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(name="btnLogin")
	WebElement btn_login;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		//This initElements method will create all WebElements
		PageFactory.initElements(driver,this);		
	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}

}
*/