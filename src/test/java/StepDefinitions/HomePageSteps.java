package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageSteps extends AbstractPageSteps {
	
	WebDriver driver = getDriver();
	HomePage homePage;
	
	@When("user clicks on deposit option")
	public void user_clicks_on_deposit_option() {
		homePage = new HomePage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		homePage.clickDepositLink();
	}

	@And("user specify account number as {int}")
	public void user_specify_account_number_as(Integer accountNo) {

	}

	@And("user specify amount as {int}")
	public void user_specify_amount_as(Integer amount) {

	}

	@And("user specify description as (.*)$")
	public void user_specify_description_as_test_amount(String description) {

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {

	}

}
