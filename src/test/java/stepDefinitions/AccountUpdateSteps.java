package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountUpdateSteps {

	@Given("user sends a request of admin account updation")
	public void user_sends_a_request_of_admin_account_updation() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println();
	}

	@When("user updates an admin account")
	public void user_updates_an_admin_account() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println();
	}

	@Then("user logs into admin account with updated details")
	public void user_logs_into_admin_account_with_updated_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println();
	}

	@Given("user sends a request of regular account updation")
	public void user_sends_a_request_of_regular_account_updation(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
		List<Map<String, String>> dt = dataTable.asMaps(String.class, String.class); //dt is a list of Map
        for (Map<String,String> d : dt){ //d is the Map
            System.out.println(d.get("username"));
        }

	}

	@When("user updates an regular account")
	public void user_updates_an_regular_account() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("regular account");
	}

	@Then("user logs into regular account with updated details")
	public void user_logs_into_regular_account_with_updated_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("regular account updated");
	}

	@Given("user sends a request of superuser account updation for {string} {string}")
	public void user_sends_a_request_of_superuser_account_updation_for(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(username+password);
	}

	@When("user updates an superuser account")
	public void user_updates_an_superuser_account() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("superuser account");
	}

	@Then("user logs into superuser account with updated details")
	public void user_logs_into_superuser_account_with_updated_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("superuser account updated");
	}

}
