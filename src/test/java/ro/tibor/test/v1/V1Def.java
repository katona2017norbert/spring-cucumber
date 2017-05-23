package ro.tibor.test.v1;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ro.tibor.test.SpringIntegrationTest;

public class V1Def extends SpringIntegrationTest{

	@Given("^the client calls as get /test(\\d+)$")
	public void the_client_calls_as_get_test(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		executeGet("http://localhost:8080/test" + arg1);
	}

	@When("^the client receives status code of (\\d+)$")
	public void the_client_receives_status_code_of(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^the client receives server version test(\\d+)$")
	public void the_client_receives_server_version_test(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
}
