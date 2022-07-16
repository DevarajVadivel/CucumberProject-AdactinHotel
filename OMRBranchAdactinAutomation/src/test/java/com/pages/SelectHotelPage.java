package com.pages;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends Baseclass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[text()='Please Select a Hotel']")
	private WebElement actualSelectHotelErrorMessage;
	
	@FindBy(xpath ="//td[text()='Book A Hotel ']")
	private WebElement actualSelectHotelSuccessfulMessage;
	
	@FindBy(id="radiobutton_0")
	private WebElement btnradio;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getActualSelectHotelErrorMessage() {
		return actualSelectHotelErrorMessage;
	}

	public WebElement getActualSelectHotelSuccessfulMessage() {
		return actualSelectHotelSuccessfulMessage;
	}

	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	public String actualSelectHotelSuccessfulMessage() {
	String actualbookhotelsuccessfulmessage = gettext(getActualSelectHotelSuccessfulMessage());
	return actualbookhotelsuccessfulmessage;	

	}
	public String actualSelectHotelErrorMessage() {
		String actualselecthotelerrormessage = gettext(actualSelectHotelErrorMessage);
		return actualselecthotelerrormessage;
	}
	
	public void selectHotel() {
		
		click(getBtnradio());
		click(getBtncontinue());
	}

	public void withoutSelectHotel() {

		click(getBtncontinue());
	}

}
