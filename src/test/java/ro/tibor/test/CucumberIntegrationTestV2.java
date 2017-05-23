package ro.tibor.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/v2",
glue = {"ro.tibor.test.v2"})
public class CucumberIntegrationTestV2 {
}