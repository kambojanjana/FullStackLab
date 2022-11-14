package com.stack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	private WebDriver driver;

	By pet_path = By.xpath("//input[@data-testid='pet']");
	By owner_path = By.xpath("//input[@data-testid='owner']");
	By date_path = By.xpath("//input[@data-testid='date']");
	By time_path = By.xpath("//input[@data-testid='time']");
	By symptoms_path = By.xpath("//textarea[@data-testid='symptoms']");
	By button_path = By.xpath("//button[@data-testid='btn-submit']");

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getSignInPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public boolean verifyEntryIn() {
		enterPetName("fibbo");
		enterOwnerName("Anjana");
		enterDate("11082022");
		enterTime("1108");
		enterSymptoms("fever");
		clickOnButtonIn();
		return true;
	}

	public boolean verifyNegativeEntryIn() {
		enterPetName("12345");
		enterOwnerName("An87654");
		enterDate("");
		enterTime("");
		enterSymptoms("cold");
		clickOnButtonIn();
		return true;
	}

	public void enterPetName(String userName) {
		WebElement petTxtBox = driver.findElement(pet_path);
		petTxtBox.sendKeys(userName);
	}

	public void enterOwnerName(String owner) {
		WebElement ownerTxtBox = driver.findElement(owner_path);
		ownerTxtBox.sendKeys(owner);
	}

	public void enterDate(String date) {
		WebElement dateTxtBox = driver.findElement(date_path);
		dateTxtBox.sendKeys(date);
	}

	public void enterSymptoms(String symptoms) {
		WebElement symptomsTxtBox = driver.findElement(symptoms_path);
		symptomsTxtBox.sendKeys(symptoms);
	}

	public void enterTime(String time) {
		WebElement ownerTxtBox = driver.findElement(time_path);
		ownerTxtBox.sendKeys(time);
	}

	public void clickOnButtonIn() {
		WebElement buttonPath = driver.findElement(button_path);
		buttonPath.click();
	}

}