package ro.tibor.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/norbi",
glue = {"ro.tibor.test.norbi"})
public class CucumberIntegrationTestNorbi {
	
	
}