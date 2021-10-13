package oh.capg;


import browser.Browser;
import excel.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;



public class LoginInvalidStepDefinition extends Browser{
	
	String url =ReadData.config("url");//reading data from config.properties
	@Given("Chrome Browser is open")
	public void chrome_browser_is_open() {
	Browser.gotourl(url);    
	}

	@Given("user is on OrangeHRM login page")
	public void user_is_on_orange_hrm_login_page() {
		System.out.println("user is on OrangeHRM login page");
	 
	}

	
	
	@When("user enters invalid credentials in {string} and {string} text fields")
	public void user_enters_invalid_credentials_in_and_text_fields(String string, String string2) {
		Locators.username().sendKeys(string);
		Locators.password().sendKeys(string2);
		Locators.loginbtn().click();
		
	}

	@Then("user is unable to login")
	public void user_is_unable_to_login() {  
		System.out.println("user is unable to login");
		
	}

	@And("the page displays error message invalid credentials")
	public void the_page_displays_error_message_invalid_credentials() { 
		System.out.println("displays error message invalid credentials");
	   
	}

}
