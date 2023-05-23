/*package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps_PF {

	WebDriver driver = null;
	LoginPage_PF loginPage;
	HomePage_PF homePage;
	
	//hooks
	@Before(value="@smoke", order=1)
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	//hooks
	@After
	public void teardown() {
		driver.close();
		driver.quit();	
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		String base_url = "https://www.demo.guru99.com/V4/";
		driver.get(base_url);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		loginPage = new LoginPage_PF(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		
		Thread.sleep(2000);
	}

	@And("click on login button")
	public void click_on_login_button() {

		loginPage.clickLogin();
	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		homePage = new HomePage_PF(driver);
		homePage.checkWelcomeMessageIsDisplayed();
	}
	
	@Then("warning message is displayed")
	public void warning_message_is_displayed() {
		String expectedAlert = "User or Password is not valid";
		String actualAlert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(expectedAlert,actualAlert);
		
	}	
	
}
*/
