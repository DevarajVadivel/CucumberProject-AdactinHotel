package com.pages;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends Baseclass {
	
	public CancelBookingPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search_result_error")
	private WebElement actualCancelMessage;
	
	@FindBy(id="username")
	private WebElement txtusername;

	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnlogin;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedintinerary;
	
	@FindBy(id="order_id_text")
	private WebElement txtorderno;
	
	@FindBy(id="search_hotel_id")
	private WebElement btngo;
	
	@FindBy(xpath="//input[contains(@id,'btn_id_')]")
	private WebElement btnfinalcancel; 
	
	public WebElement getActualCancelMessage() {
		return actualCancelMessage;
	}
	
	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getBookedintinerary() {
		return bookedintinerary;
	}

	public WebElement getTxtorderno() {
		return txtorderno;
	}

	public WebElement getBtngo() {
		return btngo;
	}

	public WebElement getBtnfinalcancel() {
		return btnfinalcancel;
	}
public void cancelBooking(String orderID) {
		
		click(getBookedintinerary());
		sendkeys(getTxtorderno(), orderID);
		click(getBtngo());
		click(getBtnfinalcancel());
		accept();
	}
	
}
