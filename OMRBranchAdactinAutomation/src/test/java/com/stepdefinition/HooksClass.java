package com.stepdefinition;

import java.io.IOException;

import org.base.Baseclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends Baseclass{
	
	@Before
	public void beforeScenario() throws IOException {
		
		getdriver(getPropertyValue("BrowserType"));
		getUrl(getPropertyValue("url"));
		timeout(30);
		maximize();
	}

	@After
	public void afterScenario(Scenario sc) {

		TakesScreenshot screenshot = (TakesScreenshot)driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "Result Screenshot");
		quit();
		
	}
	
	
	
}
