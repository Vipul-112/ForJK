package bdd_bindings;

import Login.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1 {
	@Given("user is in the homepage")
	public void user_is_in_the_homepage()
	{
		Login.start();
	}

	@When("user navigates to the login page")
	public void user_navigates_to_the_login_page()
	{
		Login.clickLogin();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		Login.enterUsernameAndPassword(string, string2);
	}

	@Then("Verify if Welcome message displayed")
	public void verify_if_welcome_message_displayed() {
		Login.verifyLogin();
	}



}
