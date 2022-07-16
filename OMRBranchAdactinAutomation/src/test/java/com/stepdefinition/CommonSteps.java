package com.stepdefinition;

import com.pageManager.PageObjectManager;

import cucumber.api.java.en.Then;


public class CommonSteps {
	
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should verify the message {string} after the login successful")
	public void user_should_verify_the_message_after_the_login_successful(String expectedSuccesslMessage) {
	
		org.junit.Assert.assertEquals("Verify Login Success Message",expectedSuccesslMessage,pom.getLoginpage().ActualLoginMessage());

	}
	


	
}
