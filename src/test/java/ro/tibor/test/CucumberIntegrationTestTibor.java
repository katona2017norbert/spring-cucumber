package ro.tibor.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/tibor",
glue = {"ro.tibor.test.tibor"})
public class CucumberIntegrationTestTibor {
	
		
}