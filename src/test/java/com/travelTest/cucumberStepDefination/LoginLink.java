package com.travelTest.cucumberStepDefination;

import org.testng.asserts.SoftAssert;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.Repo.LoginRepo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLink {
	
	BrowserOption op;
	LoginRepo login;
	
//	@Given("User launch an chrome browser")
//	public void user_launch_an_chrome_browser() throws Exception {
//	   
//	    op = new BrowserOption();
//	    login = new LoginRepo(op.launchBrowser("chrome"));
//	    Thread.sleep(2000);
//	    
//	}
	@Given("User navigate to travel test website")
	public void user_navigate_to_travel_test_website() throws Exception{
	   
	    op.NavigateToProvideURL("https://travel-test-bug.vercel.app/");
	    Thread.sleep(2000);
	    
	}
	@When("User click on login link")
	public void user_click_on_login_link() throws Exception{
	    
	login.loginLink();
	Thread.sleep(2000);
	}
	@When("verify login page has been open or not")
	public void verify_login_page_has_been_open_or_not() throws Exception {
	   
	    SoftAssert soft = new SoftAssert();
	    try
	    {
	    	soft.assertEquals(op.currentURL(), "https://travel-test-bug.vercel.app/logins");
        soft.assertAll();
        	    }
	    catch (AssertionError e) {
	    	op.quit();
	    	  soft.assertAll();
	    }
	    
	}
	@Then("User close chrome browser")
	public void user_close_chrome_browser() throws Exception {
//		op.quit();
	  
	}
	
	@When("User email address is {string} and user password is {string}")
	public void user_email_address_is_and_user_password_is(String string, String string2) throws Exception {
          login.sendEmail(string);
          Thread.sleep(2000);
          login.sendPassword(string2);
          Thread.sleep(2000);

	}
	@When("Verify user been login or not by checking its url should be {string} if test cases is")
	public void verify_user_been_login_or_not_by_checking_its_url_should_be_if_test_cases_is(String string) {
		SoftAssert soft = new SoftAssert();
	    try
	    {
	    	soft.assertEquals(op.currentURL(), "https://travel-test-bug.vercel.app/logins");
        soft.assertAll();
        	    }
	    catch (AssertionError e) {
	    	op.quit();
	    	  soft.assertAll();
	    }

	}
	@When("User click on login button")
	public void user_click_on_login_button() throws Exception {
	    login.loginButton();
	    Thread.sleep(8000);
	}

	@Before
	public void launchAnBrowser() {
		
		op = new BrowserOption();
	    login = new LoginRepo(op.launchBrowser("chrome"));
		
	}
	
	@After
	public void quitBrowser() throws Exception{
	Thread.sleep(2000);
		op.quit();
	}

}