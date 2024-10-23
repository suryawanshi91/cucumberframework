package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {
	
	WebDriver driver;
	@Given("User open browser and launch url")
	public void user_open_browser_and_launch_url() {
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("user navigated to index page")
public void user_navigated_to_index_page() {
	   	String expectedurl = "https://www.saucedemo.com/inventory.html";
	  if(expectedurl.equals(driver.getCurrentUrl()))
	    System.out.println("user landed on index page");
	    	else
	    		System.out.println("User not logged in/something went wrong");
	}


}
