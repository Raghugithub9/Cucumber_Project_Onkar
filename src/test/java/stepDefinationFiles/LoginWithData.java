package stepDefinationFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basePackage.BaseClass;
import io.cucumber.java.en.*;

public class LoginWithData {

	WebDriver driver = BaseClass.driver;
	String expectedLoginError = "Invalid username/password. Please try again.";

	@Given("User is on Login page of OpenMRS test")
	public void launchOpenMRS() {
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
	}

	@When("^User enters username (.+)$")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("^User enters password (.+)$")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("^User selects (.+) for this session test$")
	public void selectLocationForSession(String location) {
		driver.findElement(By.id(location)).click();
	}

	@And("User clicks on login button")
	public void clickOnLoginButton() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("User will see invalid username password error message test")
	public void varifyErrorMessage() {
		String actualErrorMsg = driver.findElement(By.id("error-message")).getText();
		Assert.assertEquals(expectedLoginError, actualErrorMsg);
	}

}
