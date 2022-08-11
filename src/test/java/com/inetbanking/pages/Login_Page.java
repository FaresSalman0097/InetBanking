package com.inetbanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver ldriver;

	public  Login_Page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "btnLogin")
	WebElement loginbttn;

	public void loginDetails(String uname, String pword) {

		username.sendKeys(uname);
		password.sendKeys(pword);

	}

	public void loginButton() {

		loginbttn.click();
	}

}
