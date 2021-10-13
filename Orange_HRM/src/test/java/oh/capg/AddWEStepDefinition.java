package oh.capg;


import excel.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.MyInfoPage;

public class AddWEStepDefinition {
	
		String comp_name =ReadData.readExcel(0, 1);
		String designation = ReadData.readExcel(1, 1);

		{	
		MyInfoPage.qualifications();
		}
	@When("user click on Add work experience")
	public void user_click_on_add_work_experience() {
		
		Locators.add_work_experience().click();
		
	
	}

	@And("user enters all the necessary details")
	public void user_enters_all_the_necessary_details() {
		Locators.comapny_name().sendKeys(comp_name);
		Locators.designation().sendKeys(designation);
		Locators.save_work_experience().click();
	    
	}

	@Then("user is able to succesfully add work experience")
	public void user_is_able_to_succesfully_add_work_experience() {
		System.out.println("user is able to succesfully add work experience");
	
	}
}
