package gov.va.VAPARS.steps.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "json:target/cucumber-report/cucumber.json")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "gov.va.VAPARS.steps")
@ConfigurationParameter(key= EXECUTION_DRY_RUN_PROPERTY_NAME, value="false")

public class CucumberRunner {

}
