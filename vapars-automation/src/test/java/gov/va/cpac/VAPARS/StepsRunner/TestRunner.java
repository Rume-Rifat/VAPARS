package gov.va.cpac.VAPARS.StepsRunner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Vapars_Veteran")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/cucumber-report/cucumber.html")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "gov.va.cpac.VAPARS.StepDef")
@ConfigurationParameter(key= EXECUTION_DRY_RUN_PROPERTY_NAME, value="false")

public class TestRunner {

}
