package com.facebook.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.facebook.util.WebDriver_API;

public class baseClass extends WebDriver_API {
	// com.facebook.util >> WebDriver_API
	@BeforeMethod
	public void setUp() {
		System.out.println("Seting up driver");
		driver = new FirefoxDriver();
		driver.get("https://spafinder.cashstar.com/gift-card/buy/?promo_code=&type=print&delivery=PH");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		System.out.println("Closing all connections");
		// driver.close();
		// driver.quit();

	}

}
