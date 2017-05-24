package ro.tibor.test.tibor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.springframework.http.HttpStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ro.tibor.test.SpringIntegrationTest;

public class TiborDefsIntegrationTest extends SpringIntegrationTest {
    
	@When("^the client calls as post (.*)$")
    public void the_client_calls_as_post(String url) throws Throwable {
        executePost("http://localhost:8080"+url);
    }
    
    @Given("^the client calls as get (.*)$")
    public void the_client_calls_as_get(String url) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	executeGet("http://localhost:8080"+url);
    }
    
    @Then("^the client receives server version (.*)$")
    public void the_client_receives_server_version_hello(String version) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	assertThat(latestResponse.getBody(), is(version));
    }

    @When("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " + latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    } 
    
}