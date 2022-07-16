package com.stepdefinition;

import org.junit.Assert;

import com.pageManager.PageObjectManager;

import cucumber.api.java.en.Then;

public class SearchHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should search hotel by entering all the details {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_search_hotel_by_entering_all_the_details_and(String location, String hotels,
			String roomType, String numberOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom,
			String childrenPerRoom) {

		pom.getSearchhotelpage().searchHotel(location, hotels, roomType, numberOfRooms, checkInDate, checkOutDate,
				adultsPerRoom, childrenPerRoom);

	}

	@Then("User should verify the message {string} after successfully navigate to Select Hotel page")
	public void user_should_verify_the_message_after_successfully_navigate_to_Select_Hotel_page(
			String expectedSuccessfulMessage) {

		Assert.assertEquals("Verify Search Hotel Successfull Message", expectedSuccessfulMessage,
				pom.getSearchhotelpage().actualSuccessfullSearchHotelMessage());

	}

	@Then("User should search hotel by entering mandatory details {string},{string},{string},{string} and {string}")
	public void user_should_search_hotel_by_entering_mandatory_details_and(String location, String numberOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom) {

		pom.getSearchhotelpage().searchHotel(location, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom);

	}

	@Then("User should verify the checkin and checkout error message {string},{string}")
	public void user_should_verify_the_checkin_and_checkout_error_message(String expectedErrorMessage1,
			String expectedErrorMessage2) {

		Assert.assertEquals("Verify Checkin Error Message", expectedErrorMessage1,
				pom.getSearchhotelpage().actualCheckinErrorMessage());
		Assert.assertEquals("Verify Checkout Error Message", expectedErrorMessage2,
				pom.getSearchhotelpage().actualCheckoutErrorMessage());

	}

	@Then("User should search hotel without entering any fields")
	public void user_should_search_hotel_without_entering_any_fields() {

		pom.getSearchhotelpage().searchHotel();

	}

	@Then("User should verify the Location error message {string} after search hotel")
	public void user_should_verify_the_Location_error_message_after_search_hotel(String expectedLocationErrorMessage) {

		Assert.assertEquals("Verify Location Error Message", expectedLocationErrorMessage,
				pom.getSearchhotelpage().actualLocationErrorMessage());

	}

}
