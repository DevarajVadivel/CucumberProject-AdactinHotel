package com.stepdefinition;

import org.junit.Assert;

import com.pageManager.PageObjectManager;

import cucumber.api.java.en.Then;

public class SelectHotelStep {
	PageObjectManager pom = new PageObjectManager();
	@Then("User should select a hotel and click continue")
	public void user_should_select_a_hotel_and_click_continue() {
		pom.getSelecthotelpage().selectHotel();
		
	}

	@Then("User should verify the message {string} after successfully navigate to Book Hotel Page")
	public void user_should_verify_the_message_after_successfully_navigate_to_Book_Hotel_Page(String expectedSuccessfullSelectHotelMessage) {
		
		Assert.assertEquals("Verify Search Hotel Succesfull Message",expectedSuccessfullSelectHotelMessage,pom.getSelecthotelpage().actualSelectHotelSuccessfulMessage());
	}

	@Then("User should click continue without selecting the hotel")
	public void user_should_click_continue_without_selecting_the_hotel() {
		pom.getSelecthotelpage().withoutSelectHotel();
	}

	@Then("User Should verify the select hotel error message{string} in Select Hotel Page")
	public void user_Should_verify_the_select_hotel_error_message_in_Select_Hotel_Page(String expectedSelectHotelErrorMessage) {
		
		Assert.assertEquals("Verify Select Hotel Error Message", expectedSelectHotelErrorMessage, pom.getSelecthotelpage().actualSelectHotelErrorMessage());

	}


}
