package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	private By link_deposit = By.xpath("//a[contains(text(),'Deposit')]");
	private By txt_account_no = By.name("accountno");
	private By txt_amount = By.name("ammount");
	private By txt_desc = By.name("desc");
	private By btn_submit = By.name("AccSubmit");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void checkWelcomeMessageIsDisplayed() {
		driver.getPageSource().contains("Welcome To Manager's Page of Guru99 Bank");
	}
	
	public void clickDepositLink() {
		driver.findElement(link_deposit).click();
	}
	
	public void enterAccountNumber(String accountNo) {
		driver.findElement(txt_account_no).sendKeys(accountNo);
	}
	
	public void enterAmount(String amount) {
		driver.findElement(txt_amount).sendKeys(amount);
	}
	
	public void enterDescription(String description) {
		driver.findElement(txt_desc).sendKeys(description);
	}
	
	public void clickSubmitBtn() {
		driver.findElement(btn_submit).click();
	}
}
