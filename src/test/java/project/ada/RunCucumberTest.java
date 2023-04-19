package project.ada;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("project/ada")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
//@IncludeTags("Esse")
//@ExcludeTags("Ignore")
public class RunCucumberTest {}
