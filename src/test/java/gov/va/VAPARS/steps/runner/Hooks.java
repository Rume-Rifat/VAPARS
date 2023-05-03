package gov.va.VAPARS.steps.runner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import gov.va.him.utilities.Storage;
import gov.va.him.webapp.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	final static Logger log = LogManager.getLogger(Hooks.class);
	
	@Before
    public void setupScenario() {
        Storage.initializeStorage();
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            log.info("Created screenshot " + screenshot.length + " bytes long");
            scenario.attach(screenshot, "image/png", "pic");
            try {
                makeEmbeddingsFolder();
                Files.write(new File(("target/cucumber-html-reports/embeddings/"+scenario.getId()+"-screenshot.png").replace('/', File.separatorChar)).getAbsoluteFile().toPath(), screenshot);
            } catch (IOException e) {
                log.error("Failed saving screenshot: " + scenario.getId());
                e.printStackTrace();
            }
        }
        Driver.close();
        Storage.resetStorage();
    }
    private void makeEmbeddingsFolder() {
        try {
            Files.createDirectory(new File(("target/cucumber-html-reports".replace('/', File.separatorChar))).getAbsoluteFile().toPath());
            Files.createDirectory(new File(("target/cucumber-html-reports/embeddings".replace('/', File.separatorChar))).getAbsoluteFile().toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

