package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {

		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());

		}

	}

	public String getAppURL() {
		return pro.getProperty("appUrl");
	}

	public String getUserName() {
		return pro.getProperty("username");
	}

	public String getPassword() {
		return pro.getProperty("password");
	}

	public String getChromePath() {
		return pro.getProperty("chromepath");
	}

	public String getEdgePath() {
		return pro.getProperty("edgepath");
	}

	public String getBrowser() {

		return pro.getProperty("Browser");
	}

}
