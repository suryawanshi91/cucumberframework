package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GlueCode {
	@Given("when user open browser and launch url")
	public void when_user_open_browser_and_launch_url() {
	   System.out.println("User opened the browser and launched url");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    System.out.println("User entering the username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    System.out.println("User clicks on login button");
	}

	@Then("user get navigated to next page successfully")
	public void user_get_navigated_to_next_page_successfully() {
	    System.out.println("User navigated to next page successfully");
	}



}
