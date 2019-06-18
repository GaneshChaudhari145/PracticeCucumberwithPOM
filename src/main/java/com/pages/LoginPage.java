package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
		@FindBy(name="txtUsername")	WebElement username;
		
		@FindBy(name="txtPassword")	WebElement password;
		
		@FindBy(xpath="//input[@type='submit']") WebElement loginBtn;
		
//		@FindBy(xpath="//button[contains(text(),'Sign Up')]")//		WebElement signUpBtn;
		
		@FindBy(xpath="//img[contains(@alt,'OrangeHRM')]")	WebElement hrmLogo;

		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateHRMImage(){
			return hrmLogo.isDisplayed();
		}
		
		public HomePage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			    	
			return new HomePage();
		}
}
