package gov.va.cpac.VAPARS.StepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import gov.va.cpac.VAPARS.Pages.CreateAVeteranPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewVeteranStepDef {
	
	WebDriver driver;
	CreateAVeteranPage vetPG;
		
	@Before
	public void testSetup() {
		
		driver = new EdgeDriver();
		vetPG = new CreateAVeteranPage(driver);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}	
	
	@Given("User is singed in and navigate to Dashboard {string}")
	public void user_is_singed_in_and_navigate_to_dashboard(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}

	@Given("Navigate to the Veteran page by clicking the Veteran tab")
	public void navigate_to_the_veteran_page_by_clicking_the_veteran_tab() {
		vetPG.clickTabVeteran();
	}

	@When("User click the New Veteran button")
	public void user_click_the_new_veteran_button() throws InterruptedException {
		vetPG.clickButtonNewVeteran();
		Thread.sleep(2000);
	}

	@When("Enter the Veterans SSN {string}")
	public void enter_the_veterans_ssn(String ssn) {
		vetPG.inputSSN(ssn);
	}
	
	@When("Enter the Veterans ICN {string}")
	public void enter_the_veterans_icn(String icn) {
		vetPG.inputICN(icn);
	}

	@Then("Enter the Veterans Last Name {string}")
	public void enter_the_veterans_last_name(String LastName) {
		vetPG.inputLastName(LastName);
	}

	@Then("Enter the Veterans First Name {string}")
	public void enter_the_veterans_first_name(String FirstName) throws InterruptedException {
		vetPG.inputFirstName(FirstName);
	   	Thread.sleep(5000);
	}

	@Then("User click Save Patient Details button")
	public void user_click_save_patient_details_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		vetPG.clickSavePatient();
	}

	@Then("User click Address button")
	public void user_click_address_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		vetPG.clickNewAddress();
	}

	@Then("User adds address {string}")
	public void user_adds_address(String address) {
		vetPG.inputAddress(address);
	}

	@Then("User adds postal code {string}")
	public void user_adds_postal_code(String postalcode) {
		vetPG.inputPostalCode(postalcode);
	}

	@Then("User clicks Search")
	public void user_clicks_search() throws InterruptedException {
		Thread.sleep(5000);
		vetPG.clickbuttonSearch();
		Thread.sleep(5000);
	}

	@Then("User Select the City and State")
	public void user_select_the_city_and_state() throws InterruptedException {
		Thread.sleep(5000);
		vetPG.clickSelectPC();
	}

	@Then("User clicks Save")
	public void user_clicks_save() throws InterruptedException {
		vetPG.clickSaveAddress();
		Thread.sleep(5000);
	}
	
	@Then("User clicks Close")
	public void user_clicks_close() throws InterruptedException {
		Thread.sleep(5000);
		vetPG.clickCloseAddress();
		Thread.sleep(5000);
	}
	
	@After
	public void endTesting() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}

}
