package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pages.BaseClass;
import com.inetbanking.pages.Login_Page;

public class TC_Login_001 extends BaseClass {

	Login_Page lp;

	@Test
	public void login_Test() {

		lp = new Login_Page(driver);
		lp.loginDetails(config.getUserName(), config.getPassword());
		lp.loginButton();

		String s = driver.getTitle();

		System.out.println(s);
		
		if(s.equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
}
