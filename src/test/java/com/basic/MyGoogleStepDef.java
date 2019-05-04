package com.basic;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class MyGoogleStepDef {
	
	Response res;
	
	@Given("^I want to open google$")
	public void i_want_to_open_google()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hitting google.com");
		res =RestAssured.given().get("https://www.google.com/");
	}

	
	@Then("^I want to check \"([^\"]*)\" status code$")
	public void i_want_to_check_status_code(String statusCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("validating status code");
		int stCode =res.getStatusCode();
		
		String ssStCode =Integer.toString(stCode);
		
		Assert.assertEquals(ssStCode, statusCode);
	
		
	}
}
