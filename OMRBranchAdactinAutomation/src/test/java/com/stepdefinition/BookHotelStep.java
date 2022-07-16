package com.stepdefinition;

import java.util.Map;

import org.base.Baseclass;
import org.junit.Assert;

import com.pageManager.PageObjectManager;

import cucumber.api.java.en.Then;

public class BookHotelStep extends Baseclass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should book hotel by entering all the fields {string},{string} and {string}")
	public void user_should_book_hotel_by_entering_all_the_fields_and(String firstName, String lastName,
			String billingAddress, io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> map = dataTable.asMaps().get(0);

		pom.getBookhotelpage().bookHotel(firstName, lastName, billingAddress, map.get("Credit Card No."),
				map.get("Credit Card Type"), map.get("Expiry Month"), map.get("Expiry Year"), map.get("CVV Number"));

	}

	@Then("User should verify the Booking confirmation message {string} after successfully navigate to Booking confirmation page")
	public void user_should_verify_the_Booking_confirmation_message_after_successfully_navigate_to_Booking_confirmation_page(
			String expectedSuucessfulMessage) {

		Assert.assertEquals("Verify Book Hotel Successful Message", expectedSuucessfulMessage,
				gettext(pom.getBookhotelpage().getActualBookHotelSuccessfullMessage()));
	}

	@Then("User should book a hotel by without entering any fields")
	public void user_should_book_a_hotel_by_without_entering_any_fields() {

		pom.getBookhotelpage().bookHotel();

	}

	@Then("User should verify the First Name error message {string}, Last Name error message{string},Address error message{string}, Credit card no. error message{string},credit card type error message{string},Expiry Date error message{string}and CVV Number error message{string} in Book Hotel page")
	public void user_should_verify_the_First_Name_error_message_Last_Name_error_message_Address_error_message_Credit_card_no_error_message_credit_card_type_error_message_Expiry_Date_error_message_and_CVV_Number_error_message_in_Book_Hotel_page(
			String expectedFirstNameErrorMessage, String expectedLastNameErrorMessage,
			String expectedAddressErrorMessage, String expectedCardNoErrorMessage, String expectedCardTypeErrorMessage,
			String expectedExpiryDateErrorMessage, String expectedCVVErrorMessage) {

		Assert.assertEquals("Verify First Name Error Message", expectedFirstNameErrorMessage,
				gettext(pom.getBookhotelpage().getActualFirstNameErrorMessage()));
		Assert.assertEquals("Verify Last Name Error Message", expectedLastNameErrorMessage,
				gettext(pom.getBookhotelpage().getActualLastNameErrorMessage()));
		Assert.assertEquals("Verify BillingAdress Error Message", expectedAddressErrorMessage,
				gettext(pom.getBookhotelpage().getActualAddressErrorMessage()));
		Assert.assertEquals("Verify Credit Card Number Error Message", expectedCardNoErrorMessage,
				gettext(pom.getBookhotelpage().getActualCreditCreditNoErrorMessage()));
		Assert.assertEquals("Verify Credit Card Type Error Message", expectedCardTypeErrorMessage,
				gettext(pom.getBookhotelpage().getActualCreditCardTypeErrorMessage()));
		Assert.assertEquals("Verify CreditCard Expiry Error Message", expectedExpiryDateErrorMessage,
				gettext(pom.getBookhotelpage().getActualCreditCardExpiryErrorMessage()));
		Assert.assertEquals("Verify CVV Number Message", expectedCVVErrorMessage,
				gettext(pom.getBookhotelpage().getActualCVVNoErrorMessage()));

	}

}
