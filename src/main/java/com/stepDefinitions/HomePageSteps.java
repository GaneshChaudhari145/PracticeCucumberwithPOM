package com.stepDefinitions;

import org.testng.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class HomePageSteps extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user opnes browser$")
	public void user_opnes_browser() throws Throwable {
	   TestBase.initialization();
	}

	@Then("^user is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
		loginpage =new LoginPage();
	   String title =loginpage.validateLoginPageTitle();
	   Assert.assertEquals("OrangeHRM", title);
	}

	@Then("^user logs into app$")
	public void user_logs_into_app() throws Throwable {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^Validate the home Page title$")
	public void Validate_the_home_Page_title() throws Throwable {
		 String hometitle =  homepage.verifyHomePageTitle();
		  Assert.assertEquals("OrangeHRM", hometitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
	   boolean flag = homepage.verifyCorrectUserName();
	   Assert.assertTrue(flag);
	}
	
	@Then("^admin add New User$")
	public void admin_add_New_User() throws Throwable {
	   homepage.clickOnNewUsersLink();
	}
	

}
