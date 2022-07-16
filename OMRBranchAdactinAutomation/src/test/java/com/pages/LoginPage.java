package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Devaraj.V
 * @Description : This Class contains the locators of Login Page and has reusable methods to perform login
 * @Date: 08-July-2022
 *
 */
public class LoginPage extends Baseclass {
/**
 * @Description :
 * @Date:
 */
	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username_show")
	private WebElement actualMessage;

	@FindBy(xpath = "//div[@class='auth_error']")
	private WebElement actualErrorMessage;

	@FindBy(id = "username")
	private WebElement txtusername;

	@FindBy(id = "password")
	private WebElement txtPass;

	@FindBy(id = "login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getActualMessage() {
		return actualMessage;
	}

	public WebElement getActualErrorMessage() {
		return actualErrorMessage;
	}

	public String actualErrorMessage() {
		String actualError = gettext(getActualErrorMessage());
		return actualError;

	}

	public String ActualLoginMessage() {
		String actualMessage = getattribute(getActualMessage());
		return actualMessage;
	}

	public void login(String userName, String password) throws IOException {

		String name = getPropertyValue(userName);
		sendkeys(getTxtusername(), name);
		String pass = getPropertyValue(password);
		sendkeys(getTxtPass(), pass);
		click(btnlogin);

	}

	public void loginUsingEnter(String userName, String password) throws AWTException, IOException {

		String name = getPropertyValue(userName);
		sendkeys(getTxtusername(), name);

		String pass = getPropertyValue(password);
		sendkeys(getTxtPass(), pass);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
