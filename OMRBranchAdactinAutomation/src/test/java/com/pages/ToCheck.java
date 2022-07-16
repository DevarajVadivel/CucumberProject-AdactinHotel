package com.pages;

import java.io.IOException;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToCheck extends Baseclass {

	private void check() throws IOException {
		// PageObjectManager pom = new PageObjectManager();
		// String property = System.getProperty("user.dir")+"\\Config.properties";
		// System.out.println(property);

		// boolean check = "Invalid Login details or Your Password might have
		// expired.".contains("Invalid");
		// System.out.println(check);

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("devaraj");

	}

	// public String getPropertyValue(String key) throws IOException {
	//
	// FileInputStream stream = new FileInputStream();
	// Properties properties = new Properties();
	// properties.load(stream);
	// Object values = properties.get(key);
	// String value = (String) values;
	// return value;
	// }
	public static void main(String[] args) throws IOException {

		ToCheck d = new ToCheck();
		// d.getPropertyValue("url");
		d.check();

	}

}
