package com.pages;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends Baseclass{
	
	public BookingConfirmationPage() {
		
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderno;
	
	@FindBy(id="logout")
	private WebElement btnLogout;

	public WebElement getOrderno() {
		return orderno;
	}
	
	public WebElement getBtnLogout() {
		return btnLogout;
	}

	public String confirmBooking() {
		
		String orderID = getattribute(getOrderno());

		return orderID;
		
		
	}
	
	
	



}
