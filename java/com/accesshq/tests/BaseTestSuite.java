package com.accesshq.tests;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// this is repeatable (shared) test setup for all test suites
public class BaseTestSuite {
	
	protected static WebDriver driver;
	
	@BeforeAll // before all tests in this suite
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@AfterAll // after all tests in this suite
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@BeforeEach // before each and every test in this suite (reset and clean our environemnt0
	void setUp() throws Exception {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://d1nnmphtabvt1n.cloudfront.net");
	}
}
