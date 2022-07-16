package com.pageManager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
	
	private LoginPage loginpage;
	private SearchHotelPage searchhotelpage;
	private SelectHotelPage selecthotelpage;
	private BookHotelPage bookhotelpage;
	private BookingConfirmationPage	bookingconfirmationpage;
	private CancelBookingPage cancelbookingpage;
	
	
	public LoginPage getLoginpage() {
		return (loginpage==null) ? loginpage = new LoginPage(): loginpage ;
	}
	public SearchHotelPage getSearchhotelpage() {
		return (searchhotelpage==null)? searchhotelpage = new SearchHotelPage():searchhotelpage;
	}
	public SelectHotelPage getSelecthotelpage() {
		return (selecthotelpage==null)? selecthotelpage = new SelectHotelPage(): selecthotelpage;
	}
	public BookHotelPage getBookhotelpage() {
		return (bookhotelpage==null)? bookhotelpage= new BookHotelPage():bookhotelpage;
	}
	public BookingConfirmationPage getBookingconfirmationpage() {
		return (bookingconfirmationpage==null)?bookingconfirmationpage=new BookingConfirmationPage():bookingconfirmationpage;
	}
	public CancelBookingPage getCancelbookingpage() {
		return (cancelbookingpage==null)?cancelbookingpage=new CancelBookingPage():cancelbookingpage;
	}
	
	
	
	
	

}
