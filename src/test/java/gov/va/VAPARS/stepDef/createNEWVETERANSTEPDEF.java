package gov.va.VAPARS.stepDef;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import gov.va.VAPARS.pages.VETERANPAGE;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createNEWVETERANSTEPDEF {
	
	WebDriver driver;
	VETERANPAGE vetpg = new VETERANPAGE();
	
	@Before
	public void testSetup() {
		//driver = WebDriverManager.chromedriver().create()
	
		driver = new EdgeDriver();
		//WebDriverManager.edgedriver().create();
	 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}	
	
	@Test
	@Given("User is singed in and navigate to Dashboard {string}")
	public void user_is_singed_in_and_navigate_to_dashboard(String url) throws InterruptedException {
		
		driver.get(url);
		Thread.sleep(5000);
		 
	}

	@Given("Navigate to the Veteran page by clicking the Veteran tab")
	public void navigate_to_the_veteran_page_by_clicking_the_veteran_tab() {
		
		vetpg.tabVeteran().click();		
	   
	}

	@When("User click the New Veteran button")
	public void user_click_the_new_veteran_button() {
	   
	}

	@When("Enter the Veterans SSN {string}")
	public void enter_the_veterans_ssn(String string) {
	   
	}

	@When("Enter the Veterans ICN {string}")
	public void enter_the_veterans_icn(String string) {
	  
	}

	@Then("Enter the Veterans Last Name {string}")
	public void enter_the_veterans_last_name(String string) {
	  
	}

	@Then("Enter the Veterans First Name {string}")
	public void enter_the_veterans_first_name(String string) {
	   
	}

	@Then("User click Save Patient Details button")
	public void user_click_save_patient_details_button() {
	   
	}

	@Then("User click Address button")
	public void user_click_address_button() {
	   
	}

	@Then("User adds address {string}")
	public void user_adds_address(String string) {
	  
	}

	@Then("User adds postal code {string}")
	public void user_adds_postal_code(String string) {
	   
	}

	@Then("User clicks Search")
	public void user_clicks_search() {
	    
	}

	@Then("User Select the City and State")
	public void user_select_the_city_and_state() {
	  
	}

	@Then("User clicks Save")
	public void user_clicks_save() {
	   
	}
	
	@After
	public void endTesting() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}

}
