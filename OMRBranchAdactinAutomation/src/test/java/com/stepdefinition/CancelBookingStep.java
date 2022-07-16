package com.stepdefinition;

import java.io.IOException;

import org.base.Baseclass;
import org.junit.Assert;

import com.pageManager.PageObjectManager;

import cucumber.api.java.en.Then;

public class CancelBookingStep extends Baseclass {

	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should cancel the order Id")
	public void user_should_cancel_the_order_Id() {
		
		
		pom.getCancelbookingpage().cancelBooking(pom.getBookingconfirmationpage().confirmBooking());

	}

	@Then("User should verify the booking cancelled message {string}")
	public void user_should_verify_the_booking_cancelled_message(String expectedCancelMessage) {
		
		Assert.assertEquals("Verify Cancel Message", expectedCancelMessage, gettext(pom.getCancelbookingpage().getActualCancelMessage()));

	}

	@Then("User should cancel the existing booked orderID {string}")
	public void user_should_cancel_the_existing_booked_orderID(String OrderID) throws IOException {
		
		pom.getCancelbookingpage().cancelBooking(OrderID);

	}

}
