package gov.va.cpac.VAPARS.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import gov.va.cpac.VAPARS.Pages.EditAVeteranAddressPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAVeteranAddressStepDef {
	
	WebDriver driver;
	EditAVeteranAddressPage vetPGeditAdd;
	
	@Before
	public void testSetup() {
		
		driver = new EdgeDriver();
		vetPGeditAdd = new EditAVeteranAddressPage(driver);
		
	 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}	
	
	@Given("User0 was singed in then navigate to Dashboard {string}")
	public void user0_was_singed_in_then_navigate_to_dashboard(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}

	@Given("User0 will Navigate to Veteran page by clicking the Veteran tab")
	public void user0_will_navigate_to_veteran_page_by_clicking_the_veteran_tab() {
		vetPGeditAdd.clickTabVeteran();
	}

	@When("User0 will Enter the desired Veterans SSN {string}")
	public void user0_will_enter_the_desired_veterans_ssn(String ssn) throws InterruptedException {
		vetPGeditAdd.lookupVeteran(ssn);
		Thread.sleep(5000);
	}
	
	@When("User0 will Click lookup the Search button")
	public void user0_will_click_lookup_the_search_button() {
		vetPGeditAdd.SSNsearchVet();
	}

	@Then("User0 will Click the Veteran Select button")
	public void user0_will_click_the_veteran_select_button() throws InterruptedException {
		vetPGeditAdd.SelectVetSSNsearch();
		Thread.sleep(5000);
	}
	
	@Then("User0 will Click Close button")
	public void user0_will_click_close_button() {
		vetPGeditAdd.CloseVetSSNsearch();
	}
	
	@Then("User0 Clicks Address History")
	public void user0_clicks_address_history() {
		vetPGeditAdd.ClickAddressHistory();
	}

	@Then("User0 Clicks Edit")
	public void user0_clicks_edit() throws InterruptedException {
		vetPGeditAdd.ClickEditAddress();
		Thread.sleep(5000);
	}
	
	@Then("User0 will Add address {string}")
	public void user0_will_add_address(String address) {
		vetPGeditAdd.inputEditAddress(address);
	}

	@Then("User0 will Add postal code {string}")
	public void user0_will_add_postal_code(String postalcode) {
		vetPGeditAdd.inputPostalCode(postalcode);
	}

	@Then("User0 will Click Search")
	public void user0_will_click_search() throws InterruptedException {
		Thread.sleep(5000);
		vetPGeditAdd.clickbuttonSearch();
		Thread.sleep(5000);
	}

	@Then("User0 will Select the City and State")
	public void user0_will_select_the_city_and_state() throws InterruptedException {
		Thread.sleep(5000);
		vetPGeditAdd.clickEditPC();
	}

	@Then("User0 will Click Save")
	public void user0_will_click_save() throws InterruptedException {
		vetPGeditAdd.clickSaveAddress();
		Thread.sleep(5000);
	}
	
	@Then("User0 will Click Close")
	public void user0_will_click_close() throws InterruptedException {
		Thread.sleep(5000);
		vetPGeditAdd.clickCloseEditAddress();
		Thread.sleep(5000);
	}

	@After
	public void endTesting() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}

}
