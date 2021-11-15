package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	public static WebDriver wd;
	
	
	@FindBy(name = "Submit")
	private WebElement ac;
	
	public AddToCart(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getAc() {
		return ac;
	}

	

}
