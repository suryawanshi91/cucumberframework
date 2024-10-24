
package gluecodedLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageWithMultipleData {

	WebDriver driver;
	@Before
	public void Before_scenario()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}
	
	@After
	public void After_scenario()
	{
		driver.quit();
	}
	
	@Given("User is on LoginPage")
	public void user_is_on_login_page() 
	{
		 
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_standard_user_and_secret_sauce(String un , String pwd) {
		 driver.findElement(By.id("user-name")).sendKeys(un);
		 driver.findElement(By.id("password")).sendKeys(pwd);
		 System.out.println("I m ApurvaS");
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("User navigated to homepage")
	public void user_navigated_to_homepage() {
		String expectedurl = "https://www.saucedemo.com/inventory.html";
    	if(expectedurl.equals(driver.getCurrentUrl()))
    	System.out.println("user landed on index page");
    	else
    		System.out.println("User not logged in/something went wrong");
	}
} 
