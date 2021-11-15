package com.Help;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigureReader {

	public static Properties p;
	
	public String url() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\Mini_project2\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(file);
		
		String url = p.getProperty("url");
		
		return url;
		
	}

	public String username() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\Mini_project2\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();

		p.load(file);
		
		String username = p.getProperty("username");
		
		return username;
	}

	public String password() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\Mini_project2\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(file);
		
		String password = p.getProperty("password");
		
		return password;
	}
}