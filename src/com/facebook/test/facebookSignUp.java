package com.facebook.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.facebook.base.baseClass;
import com.facebook.locators.locatorsClass;
import com.facebook.values.valueClasses;

public class facebookSignUp extends baseClass {
	// baseClass extends WebDriver_API class

	valueClasses vc = new valueClasses();
	locatorsClass lc = new locatorsClass();

	@Test
	public void signUpTest() throws IOException {
		// type first name
		dropDownSelect(lc.gcValueLocator, vc.gcValue);
		screenShot("FirstNameTestScreenshot");

	}

}