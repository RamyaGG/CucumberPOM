package com.qa.stepDefinitions;

import com.a.pages.HomePage;
import com.a.pages.LoginPage;
import com.qa.base.TestBase;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {
	
	LoginPage loginPage ;
	HomePage homePage;
	@Given("^user opens the browser$")
	public void user_opens_the_browser()  {
	    
	   initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page()  {
	    loginPage  = new LoginPage();
	  String title =  loginPage.validateLoginPageTitle();
	  Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user logs into app$")
	public void user_enters_username_and_pasword()  {
	     
	  homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Then("^validate home page titile$")
	public void validate_home_page_titile()  {
		
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homeTitle);  
	    
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username()  {
	    
	  boolean flag = homePage.verifyCorrectUserName();
	  Assert.assertTrue(flag);
	}

}
