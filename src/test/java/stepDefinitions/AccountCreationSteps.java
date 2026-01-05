package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreationSteps {

    @Given("user sends a request of {string} account creation")
    public void user_sends_a_request_of_account_creation(String userType) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user sends a request of admin account creation");
    }

    @When("user creates an admin account")
    public void user_creates_an_admin_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user creates an admin account");
    }

    @Then("user logs into admin account")
    public void user_logs_into_admin_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user logs into admin account");
    }

//    @Given("user sends a request of regular account creation")
//    public void user_sends_a_request_of_regular_account_creation() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("user sends a request of regular account creation");
//    }

    @When("user creates an regular account")
    public void user_creates_an_regular_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user creates an regular account");
    }

    @Then("user logs into regular account")
    public void user_logs_into_regular_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user logs into regular account");
    }

//    @Given("user sends a request of superuser account creation")
//    public void user_sends_a_request_of_superuser_account_creation() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("user sends a request of superuser account creation");
//    }

    @When("user creates an superuser account")
    public void user_creates_an_superuser_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user creates an superuser account");
    }

    @Then("user logs into superuser account")
    public void user_logs_into_superuser_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user logs into superuser account");
    }


}
