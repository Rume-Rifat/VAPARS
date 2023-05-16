package gov.va.cpac.VAPARS.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import gov.va.cpac.VAPARS.Pages.SearchForAVeteranPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchForAVeteranStepDef {
	
	WebDriver driver;
	SearchForAVeteranPage vetSearch;
	
	@Before
	public void testSetup() {
		
		driver = new EdgeDriver();
		vetSearch = new SearchForAVeteranPage(driver);
		
	 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}	
	
	@Given("User3 was singed in and navigate to Dashboard {string}")
	public void user3_was_singed_in_and_navigate_to_dashboard(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}

	@Given("User3 Navigate to Veteran page by clicking the Veteran tab")
	public void user3_navigate_to_veteran_page_by_clicking_the_veteran_tab() {
		vetSearch.clickTabVeteran();
	}

	@When("User3 Enter the desired Veterans SSN {string}")
	public void user3_enter_the_desired_veterans_ssn(String ssn) throws InterruptedException {
		vetSearch.lookupVeteran(ssn);
		Thread.sleep(5000);
	}
	
	@When("User3 Click lookup the Search button")
	public void user3_click_lookup_the_search_button() {
		vetSearch.SSNsearchVet();
	}

	@Then("User3 Click the Veteran Select button")
	public void user3_click_the_veteran_select_button() throws InterruptedException {
		vetSearch.SelectVetSSNsearch();
		Thread.sleep(5000);
	}
	
	@Then("User3 clicks Close button")
	public void user3_clicks_close_button() {
		vetSearch.CloseVetSSNsearch();
	}

	@After
	public void endTesting() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}

}
