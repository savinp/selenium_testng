package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA {
		
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching chrome browser");		
		System.setProperty("webdriver.chrome.driver",
                "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--whitelisted-ips=\"\"", "--disable-extensions","--no-sandbox");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGooglePageTitleInChrome() {
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}

	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing chrome browser");
			driver.quit();
		}
	}
}
