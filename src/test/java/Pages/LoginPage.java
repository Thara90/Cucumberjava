package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	private By txt_username = By.name("uid");
	private By txt_password = By.name("password");
	private By btn_login = By.name("btnLogin");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		//if(!driver.getTitle().equals("Guru99 Bank Home Page")) {
			//throw new IllegalStateException("This is not login page"+driver.getCurrentUrl()+driver.getTitle());
		//}
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void checkWelcomeMessageIsDisplayed() {
		driver.getPageSource().contains("Welcome To Manager's Page of Guru99 Bank");
	}
	
/*	public void loginValidUser(String username,String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	*/
}
