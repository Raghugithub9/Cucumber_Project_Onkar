package stepDefinationFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basePackage.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

	/*
	 * Given User is on Login page of OpenMRS When User enters invalid user name and
	 * password And click on login button Then User will see invalid username
	 * password error message
	 */

	WebDriver driver = BaseClass.driver;
	String expectedLoginError = "Invalid username/password. Please try again.";

	@Given("User is on Login page of OpenMRS")
	public void launchOpenMRS() {
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
	}

	@When("User enters invalid user name")
	public void enterUserName() {
		driver.findElement(By.id("username")).sendKeys("Test");
	}

	@And("User enters invalid password")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("Test123");
	}

	@And("User selects location for this session")
	public void selectLocationForSession() {
		driver.findElement(By.id("Inpatient Ward")).click();
	}

	@And("click on login button")
	public void clickOnLoginButton() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("User will see invalid username password error message")
	public void varifyErrorMessage() {
		String actualErrorMsg = driver.findElement(By.id("error-message")).getText();
		Assert.assertEquals(expectedLoginError, actualErrorMsg);
	}

	@When("User enters valid user name")
	public void enterValidUsername() {
		driver.findElement(By.id("username")).sendKeys("Admin");
	}

	@When("User enters valid password")
	public void enterValidPassword() {
		driver.findElement(By.id("password")).sendKeys("Admin123");
	}

	@Then("User will be on home page")
	public void verifyLoginSuccess() {
		Boolean success = driver.findElement(By.partialLinkText("Logout")).isDisplayed();
		Assert.assertEquals(true, success);
	}

}
