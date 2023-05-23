package gov.va.cpac.vapars.steps.StepsRunner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/cucumber-report/cucumber.json")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "gov.va.him, gov.va.cpac.vapars.steps")
@ConfigurationParameter(key= EXECUTION_DRY_RUN_PROPERTY_NAME, value="false")

public class TestRunner {

}
