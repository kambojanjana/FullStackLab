package com.stack;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.stack.BasePage;
import com.stack.MainPage;
import com.stack.TestBaseSetup;

public class MainPageTest extends TestBaseSetup {
	private WebDriver driver;
	private MainPage mainPage;
	private BasePage basePage;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	@Test
	public void verifyMainPageFunction() {
		System.out.println("Sign In functionality details...");
		basePage = new BasePage(driver);
		mainPage = basePage.clickMainPageBtn();
		Assert.assertTrue(mainPage.verifyEntryIn(), "Adding entry");

	}

	@Test
	public void verifyNeagtiveMainPageFunction() {
		System.out.println("Sign In functionality details...");
		basePage = new BasePage(driver);
		mainPage = basePage.clickMainPageBtn();
		Assert.assertTrue(mainPage.verifyNegativeEntryIn(), "Adding entry");

	}

}