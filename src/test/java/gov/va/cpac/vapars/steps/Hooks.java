package gov.va.cpac.vapars.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import gov.va.him.utilities.Storage;
import gov.va.him.webapp.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {

    @BeforeAll
    public static void setupScenario() {
        Storage.initializeStorage();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "pic");
        }
        Driver.close();
    }
}
