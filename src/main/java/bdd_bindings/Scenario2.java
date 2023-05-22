package bdd_bindings;

import java.util.List;

import Login.Login;
import io.cucumber.java.en.Then;

public class Scenario2 {
	

	@Then("User clicks on category")
	public void user_clicks_on_category(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String fish = data.get(0).get(0);
		Login.clickCategory(fish);
	}

	@Then("User clicks on fish")
	public void user_clicks_on_fish(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String fish = data.get(0).get(0);
		Login.clickRow(fish);
	}

	@Then("User clicks on add to cart for fish")
	public void user_clicks_on_add_to_cart_for_fish(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String rowNum = data.get(0).get(0);
		Login.clickAdd(rowNum);
	}

	@Then("User clicks on proceed to checkout")
	public void user_clicks_on_proceed_to_checkout() {
		Login.clickProceed();
		Login.enterUsernameAndPassword("j2ee", "j2ee");

	}
	@Then("User enters the shipping and billing details and clicks continue")
	public void user_enters_the_shipping_and_billing_details_and_clicks_continue() {
	    Login.clickContinueAndSubmit();
	}
	@Then("User verifies the shipping details and clicks confirm")
	public void user_verifies_the_shipping_details_and_clicks_confirm() {
	    Login.clickContinueAndSubmit();
	}
	@Then("Verify if the order has been submitted successfully")
	public void verify_if_the_order_has_been_submitted_successfully() {
	    Login.verifyOrder();
	}

}
