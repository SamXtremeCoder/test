package com.accesshq.tests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.accesshq.pages.HomePage;

// this is a test suite which can contain many tests
class FormsPageTest extends BaseTestSuite  {

	// this is an individual test case
	@Test
	void testMandatoryErrors() {
		HomePage homePage = new HomePage(driver);
		
		
	}

	// this is an individual test case
	@Test
	void testSuccessfulSubmission() {
		fail("Not yet implemented");
	}

}
