/*package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Deposit')]")
	WebElement link_deposit;
	
	@FindBy(name="accountno")
	WebElement txt_account_no;
	
	@FindBy(name="ammount")
	WebElement txt_amount;
	
	@FindBy(name="desc")
	WebElement txt_desc;
	
	@FindBy(name="AccSubmit")
	WebElement btn_submit;

	public HomePage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	public void checkWelcomeMessageIsDisplayed() {
		driver.getPageSource().contains("Welcome To Manager's Page of Guru99 Bank");
	}
	
	public void clickDepositLink() {
		link_deposit.click();
	}
	
	public void enterAccountNumber(String accountNo) {
		txt_account_no.sendKeys(accountNo);
	}
	
	public void enterAmount(String amount) {
		txt_amount.sendKeys(amount);
	}

	
	public void enterDescription(String description) {
		txt_desc.sendKeys(description);
	}
	
	public void clickSubmitBtn() {
		btn_submit.click();
	}


}
*/