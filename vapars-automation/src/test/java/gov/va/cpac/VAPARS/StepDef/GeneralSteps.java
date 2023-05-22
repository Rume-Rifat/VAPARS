package gov.va.cpac.VAPARS.StepDef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.va.him.utilities.ConfigPropReader;
import gov.va.him.webapp.BrowserUtil;
import io.cucumber.java.en.Given;

public class GeneralSteps extends BrowserUtil {
	
	final static Logger log = LogManager.getLogger(GeneralSteps.class);
	
	@Given("the user is singed in and navigate to Dashboard")
	public void the_user_is_singed_in_and_navigate_to_Dashboard() {
		getDriver().get(ConfigPropReader.getProperty("baseURL"));
	}

}
