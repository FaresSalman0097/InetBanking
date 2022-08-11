package com.inetbanking.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.inetbanking.pages.BaseClass;

public class BrowserAction {

	public static WebDriver startApp(WebDriver driver, String browsername, String appUrl) {

		if (browsername.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browsername.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("The browser is not supported");
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;

	}

	public static void quitApp(WebDriver driver) {

		driver.quit();
	}

}
