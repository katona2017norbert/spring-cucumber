package ro.tibor.test.v2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.springframework.http.HttpStatus;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ro.tibor.test.SpringIntegrationTest;

public class V2Def extends SpringIntegrationTest{

	@Given("^the client calls as get /egy(\\d+)ketto(\\d+)$")
	public void the_client_calls_as_get_egy_ketto(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		executeGet("http://localhost:8080/egy" + arg1 + "ketto" + arg2);
	}

	@When("^the client receives status code of (\\d+)$")
	public void the_client_receives_status_code_of(int statusCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^the client receives server version (\\d+)$")
	public void the_client_receives_server_version(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
}
