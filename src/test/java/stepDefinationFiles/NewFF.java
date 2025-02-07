package stepDefinationFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewFF {

	@Given("^I want to write a step with (.+)$")
	public void i_want_to_write_a_step_with_name1(String name) {
		System.out.println(name);
	}

	@When("^I check for the (.+) in step$")
	public void i_check_for_the_in_step(Integer value) {
		System.out.println(value);
	}

	@Then("^I verify the (.+) in step$")
	public void i_verify_the_success_in_step(String status) {
		System.out.println(status);
	}
}
