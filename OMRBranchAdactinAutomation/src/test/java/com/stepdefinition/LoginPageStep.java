package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.base.Baseclass;
import org.junit.Assert;

import com.pageManager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends Baseclass {

	PageObjectManager pom = new PageObjectManager();
	
	@Given("User is on the Adactin login page")
	public void user_is_on_the_Adactin_login_page() throws IOException {

	}

	@When("User perform login {string},{string}")
	public void user_perform_login(String userName, String password) throws IOException {
		
		pom.getLoginpage().login(userName,password);
	
	}

	@When("User perform login {string},{string} using Enter key")
	public void user_perform_login_using_Enter_key(String userName, String password) throws IOException, AWTException {
		pom.getLoginpage().loginUsingEnter(userName,password);

	}

	@Then("User should verify the error message which contains {string}")
	public void user_should_verify_the_error_message_which_contains(String expectedLoginErrorMessage) {
		
	String actualErrorMessage = pom.getLoginpage().actualErrorMessage();
	boolean check = actualErrorMessage.contains(expectedLoginErrorMessage);
	Assert.assertTrue("Verify Login Error Message", check);
	}

}
