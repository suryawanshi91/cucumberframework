package stepsOfBackground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {
	WebDriver driver;
	WebElement user;
	WebElement pwd;
	
	@Before
	public void Before_Scenario()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}
	@After
	public void After_Scenario() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	    user = driver.findElement(By.id("user-name"));
	    pwd = driver.findElement(By.id("password"));
	}
	
	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    user.sendKeys("standard_user");
	    pwd.sendKeys("secret_sauce");
	}

	@And("clicks on login Button")
	public void clicks_on_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("User landed on homepage")
	public void user_landed_on_homepage() {
	  System.out.println("User landed on home page");
	}

	@And("User clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
	  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}

	@Then("Product added to the cart")
	public void product_added_to_the_cart() {
	    driver.findElement(By.className("shopping_cart_link")).click();
	    if(driver.getPageSource().contains("Sauce Labs Backpack")) 
	    	System.out.println("product added to the cart");
	    else
	    		System.out.println("product not added to the cart");
	    }
	

	@And("User clicks on menu")
	public void user_clicks_onmenu() {
	   driver.findElement(By.id("react-burger-menu-btn")).click();
	}

	@Then("Logout option is visible")
	public void logout_option_is_visible() {
	    if(driver.getPageSource().contains("Logout"))
	    	System.out.println("logout option is visible");
	    else
	    	System.out.println("logout option is not visible");
	}


}
