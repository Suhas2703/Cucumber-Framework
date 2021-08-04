package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToActitime
{
	WebDriver driver;
	
	@Given("when user enters {string}")
	public void when_user_enters(String string) {
		
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(string);
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) {
	    System.out.println();
	    
	}

	@Then("click on login button")
	public void click_on_login_button() {
		System.out.println();
	    
	}

	@When("user clicks on tasks")
	public void user_clicks_on_tasks() {
		System.out.println();
	    
	}

	@Then("click on new task")
	public void click_on_new_task() {
		System.out.println();
	    
	}	
}
