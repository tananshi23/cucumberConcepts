package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountDeletion {

    @Given("user sends a request of superuser account creation")
    public void user_sends_a_request_of_superuser_account_creation() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user sends a request of superuser account creation");
    }

    @When("user deletes an superuser account")
    public void user_deletes_an_superuser_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user deletes an superuser account");
    }

    @Then("user logs into superuser account")
    public void user_logs_into_superuser_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user logs into superuser account");
    }
}
