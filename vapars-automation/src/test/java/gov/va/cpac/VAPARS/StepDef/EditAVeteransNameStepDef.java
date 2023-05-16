package gov.va.cpac.VAPARS.StepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import gov.va.cpac.VAPARS.Pages.EditAVeteransNamePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAVeteransNameStepDef {
		
	WebDriver driver;
	EditAVeteransNamePage vetEditName;
	
	@Before
	public void testSetup() {
		
		driver = new EdgeDriver();
		vetEditName = new EditAVeteransNamePage(driver);
		
	 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}	
	
	@Given("User2 was singed in then navigate to Dashboard {string}")
	public void user2_was_singed_in_then_navigate_to_dashboard(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}
	
	@And("User2 will Navigate to Veteran page by clicking the Veteran tab")
	public void user2_will_navigate_to_veteran_page_by_clicking_the_veteran_tab() {
		vetEditName.clickTabVeteran();
	}
	
	@When("User2 will Enter the desired Veterans SSN {string}")
	public void user2_will_enter_the_desired_veterans_ssn(String ssn) throws InterruptedException {
		vetEditName.lookupVeteran(ssn);
		Thread.sleep(5000);
	}
	
	@When("User2 will Click lookup the Search button")
	public void user2_will_click_lookup_the_search_button() {
		vetEditName.SSNsearchVet();
	}

	@Then("User2 will Click the Veteran Select button")
	public void user2_will_click_the_veteran_select_button() throws InterruptedException {
		vetEditName.SelectVetSSNsearch();
		Thread.sleep(5000);
	}
	
	@Then("User2 will Click Close button")
	public void user2_will_click_close_button() {
		vetEditName.CloseVetSSNsearch();
	}
	
	@Then("User2 Clicks Edit Details")
	public void user2_clicks_edit_details() {
		vetEditName.clickEditVetDetails();
	}
	
	@Then("User2 Enter the Veterans Last Name {string}")
	public void user_enter_the_veterans_last_name(String LastName) {
		vetEditName.inputEditLastName(LastName);
	}

	@Then("User2 Enter the Veterans First Name {string}")
	public void user2_enter_the_veterans_first_name(String FirstName) throws InterruptedException {
		vetEditName.inputEditFirstName(FirstName);
	   	Thread.sleep(5000);
	}

	@Then("User2 clicks Save Patient Details button")
	public void user2_clicks_save_patient_details_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		vetEditName.clickCloseAddress();
	}
	
	@After
	public void endTesting() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}

}
