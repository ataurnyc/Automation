package com.facebook.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_API {

	public WebDriver driver;

	// -------------------- TYPE in Values -------------
	// -------------------------------------------------
	public void typeByXpath(String locator, String value) {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}

	public void typeById(String locator, String value) {
		driver.findElement(By.id(locator)).sendKeys(value);
	}

	public void typeByCss(String locator, String value) {
		driver.findElement(By.cssSelector(locator)).sendKeys(value);
	}

	// -------------------- CLICK
	// -------------------------------------------------
	public void clickByXpath(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	// --------------- radio Button --------------------------
	// ????????????????????????????????????????????????????????
	public void rdBtnSelect(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	// -------------- dropDown ----------------------------------
	public void dropDownSelect(String locator, String vText) {
		// Logger APPLICATION_LOGS = Logger.getLogger("rootLogger");
		// APPLICATION_LOGS.debug("Drop Down Method Starts....wait!");

		Select drVal = new Select(driver.findElement(By.xpath(locator)));
		drVal.selectByVisibleText(vText);
	}

	// ---------------------- screenShot ---------------

	public void screenShot(String screenshotName) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "\\screenShots\\" + screenshotName + ".png"));
	}

}
