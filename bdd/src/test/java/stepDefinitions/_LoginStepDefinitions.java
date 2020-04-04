package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class _LoginStepDefinitions {
	
	@Before
	public void setup() {
		System.out.println("setup");
	}
	
	@After
	public void tearDown() {
		System.out.println("tear down");
	}
	
	@Given("open the browser")
	public void open_the_browser() {
		System.out.println("open the browser");	
	}

	@When("enter the URL")
	public void enter_the_URL() {
		System.out.println("enter the URL");
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() {
		System.out.println("login page should be displayed"); 
	}

	@When("enter the username {string} and password {string}")
	public void enter_the_username_and_password(String string, String string2) {
		System.out.println("enter the {string} and {string}");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println("home page should be displayed");
	}


}
