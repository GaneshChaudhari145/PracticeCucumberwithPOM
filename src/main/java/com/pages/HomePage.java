package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//a[contains(text(),'Welcome Admin')]") WebElement userNameLabel;

	@FindBy(xpath = "//b[contains(text(),'Admin')]") WebElement adminLink;
	
	@FindBy(xpath = "//a[contains(text(),'User Management')]")	WebElement userMgmtLink;
	
	@FindBy(xpath = "//a[contains(text(),'Users')]") WebElement newUsersLink;
	
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}

	public void clickOnNewUsersLink(){
		Actions action = new Actions(driver);
		action.moveToElement(adminLink);
		action.moveToElement(userMgmtLink).build().perform();
		newUsersLink.click();
		
	}
}
