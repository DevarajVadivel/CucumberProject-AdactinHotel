package com.pages;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends Baseclass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//td[text()='Booking Confirmation ']")
	private WebElement actualBookHotelSuccessfullMessage;
	
	@FindBy(xpath = "//label[text()='Please Enter your First Name']")
	private WebElement actualFirstNameErrorMessage;

	@FindBy(xpath = "//label[text()='Please Enter you Last Name']")
	private WebElement actualLastNameErrorMessage;

	@FindBy(xpath = "//label[text()='Please Enter your Address']")
	private WebElement actualAddressErrorMessage;

	@FindBy(xpath = "//label[text()='Please Enter your 16 Digit Credit Card Number']")
	private WebElement actualCreditCreditNoErrorMessage;

	@FindBy(xpath = "//label[text()='Please Select your Credit Card Type']")
	private WebElement actualCreditCardTypeErrorMessage;

	@FindBy(xpath = "//label[text()='Please Select your Credit Card Expiry Month']")
	private WebElement actualCreditCardExpiryErrorMessage;

	@FindBy(xpath = "//label[text()='Please Enter your Credit Card CVV Number']")
	private WebElement actualCVVNoErrorMessage;

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtCardNo;

	@FindBy(id = "cc_type")
	private WebElement dDnCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement dDnExpiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement dDnExpiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement txtCvvno;

	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	public WebElement getActualBookHotelSuccessfullMessage() {
		return actualBookHotelSuccessfullMessage;
	}

	public WebElement getActualFirstNameErrorMessage() {
		return actualFirstNameErrorMessage;
	}

	public WebElement getActualLastNameErrorMessage() {
		return actualLastNameErrorMessage;
	}

	public WebElement getActualAddressErrorMessage() {
		return actualAddressErrorMessage;
	}

	public WebElement getActualCreditCreditNoErrorMessage() {
		return actualCreditCreditNoErrorMessage;
	}

	public WebElement getActualCreditCardTypeErrorMessage() {
		return actualCreditCardTypeErrorMessage;
	}

	public WebElement getActualCreditCardExpiryErrorMessage() {
		return actualCreditCardExpiryErrorMessage;
	}

	public WebElement getActualCVVNoErrorMessage() {
		return actualCVVNoErrorMessage;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getdDnCardType() {
		return dDnCardType;
	}

	public WebElement getdDnExpiryMonth() {
		return dDnExpiryMonth;
	}

	public WebElement getdDnExpiryYear() {
		return dDnExpiryYear;
	}

	public WebElement getTxtCvvno() {
		return txtCvvno;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public void bookHotel(String firstname, String lastname, String address, String cardno, String cardtype,
			String expirymonth, String expiryear, String cvvno) {

		sendkeys(getTxtFirstName(), firstname);
		sendkeys(getTxtLastName(), lastname);
		sendkeys(getTxtAddress(), address);
		sendkeys(getTxtCardNo(), cardno);
		sendkeys(getdDnCardType(), cardtype);
		sendkeys(getdDnExpiryMonth(), expirymonth);
		sendkeys(getdDnExpiryYear(), expiryear);
		sendkeys(getTxtCvvno(), cvvno);
		click(getBtnBookNow());

	}

	public void bookHotel() {

		click(getBtnBookNow());

	}

}
