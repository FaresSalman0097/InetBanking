package com.inetbanking.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.BrowserAction;
import com.inetbanking.utilities.ConfigDataProvider;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;

	@BeforeSuite
	public void cofigReader() {
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void startBrowser() {

		driver = BrowserAction.startApp(driver, config.getBrowser(), config.getAppURL());
	}

	@AfterClass
	public void quitBrowser() {
		BrowserAction.quitApp(driver);
	}

}
