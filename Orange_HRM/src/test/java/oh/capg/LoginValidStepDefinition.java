package oh.capg;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import browser.Browser;
import pages.LoginPage;
import excel.ReadData;



public  class LoginValidStepDefinition extends Browser {
	String url =ReadData.config("url"); //for reading the data from property file by class readdata class in excel package
	@Given("Browser is open")
	public void browser_is_open()  {
	System.out.println("Browser is open");  
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
		LoginPage.lpage(url);
	  
	}

	@When("user enters valid credentials in username and password text fields")
	public void user_enters_valid_credentials_in_username_and_password_text_fields()    {
		
	}

	@Then("user is able to login successfully")
	public void user_is_able_to_login_successfully() {
	
			 System.out.println("user is able to login succesfully");
		 
	}

	@And("user is able to view homepage")
	public void user_is_able_to_view_homepage() {

		System.out.println("user is able to view homepage");
  
	}


}
