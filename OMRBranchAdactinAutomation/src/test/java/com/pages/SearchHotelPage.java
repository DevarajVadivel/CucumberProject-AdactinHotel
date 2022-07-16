package com.pages;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends Baseclass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement actualSuccessfullSearchHotelMessage;

	@FindBy(xpath = "//span[text()='Check-In Date shall be before than Check-Out Date']")
	private WebElement actualCheckinErrorMessage;

	@FindBy(xpath = "//span[text()='Check-Out Date shall be after than Check-In Date']")
	private WebElement actualCheckoutErrorMessage;

	@FindBy(xpath = "//span[text()='Please Select a Location']")
	private WebElement actualLocationErrorMessage;

	@FindBy(id = "location")
	private WebElement dDnLocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomtype;

	@FindBy(id = "room_nos")
	private WebElement dDnNoofrooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckindate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckoutdate;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultsperroom;

	@FindBy(id = "child_room")
	private WebElement dDnChildperroom;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	public WebElement getActualLocationErrorMessage() {
		return actualLocationErrorMessage;
	}

	public WebElement getActualSuccessfullSearchHotelMessage() {
		return actualSuccessfullSearchHotelMessage;
	}

	public WebElement getActualCheckoutErrorMessage() {
		return actualCheckoutErrorMessage;
	}

	public WebElement getActualCheckinErrorMessage() {
		return actualCheckinErrorMessage;
	}

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomtype() {
		return dDnRoomtype;
	}

	public WebElement getdDnNoofrooms() {
		return dDnNoofrooms;
	}

	public WebElement getTxtCheckindate() {
		return txtCheckindate;
	}

	public WebElement getTxtCheckoutdate() {
		return txtCheckoutdate;
	}

	public WebElement getdDnAdultsperroom() {
		return dDnAdultsperroom;
	}

	public WebElement getdDnChildperroom() {
		return dDnChildperroom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public String actualLocationErrorMessage() {
		String actuallocationerrormessage = gettext(getActualLocationErrorMessage());
		return actuallocationerrormessage;
		
	}

	public String actualCheckinErrorMessage() {
		String getactualcheckinerrormessage = gettext(getActualCheckinErrorMessage());
		return getactualcheckinerrormessage;
	}

	public String actualCheckoutErrorMessage() {
		String actualcheckouterrormessage = gettext(getActualCheckoutErrorMessage());
		return actualcheckouterrormessage;
	}

	public String actualSuccessfullSearchHotelMessage() {
		String actualsuccessfullsearchhotelmessage = gettext(actualSuccessfullSearchHotelMessage);
		return actualsuccessfullsearchhotelmessage;

	}

	public void searchHotel(String location, String hotels, String roomttype, String noofrooms, String checkindate,
			String checkoutdate, String adultsperroom, String childperroom) {

		selectbyvisibletext(getdDnLocation(), location);
		selectbyvisibletext(getdDnHotels(), hotels);
		selectbyvisibletext(getdDnRoomtype(), roomttype);
		selectbyvisibletext(getdDnNoofrooms(), noofrooms);
		clear(getTxtCheckindate());
		sendkeys(getTxtCheckindate(), checkindate);
		clear(getTxtCheckoutdate());
		sendkeys(getTxtCheckoutdate(), checkoutdate);
		selectbyvisibletext(getdDnAdultsperroom(), adultsperroom);
		selectbyvisibletext(getdDnChildperroom(), childperroom);
		click(getBtnSubmit());
	}

	public void searchHotel(String location, String noofrooms, String checkindate, String checkoutdate,
			String adultsperroom) {

		selectbyvisibletext(getdDnLocation(), location);
		selectbyvisibletext(getdDnNoofrooms(), noofrooms);
		clear(getTxtCheckindate());
		sendkeys(getTxtCheckindate(), checkindate);
		clear(getTxtCheckoutdate());
		sendkeys(getTxtCheckoutdate(), checkoutdate);
		selectbyvisibletext(getdDnAdultsperroom(), adultsperroom);
		click(getBtnSubmit());
	}

	public void searchHotel() {
		click(getBtnSubmit());
	}

}
