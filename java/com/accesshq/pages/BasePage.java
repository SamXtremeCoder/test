package com.accesshq.pages;

import org.openqa.selenium.WebDriver;

// this is shared code for all pages
public class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

}
