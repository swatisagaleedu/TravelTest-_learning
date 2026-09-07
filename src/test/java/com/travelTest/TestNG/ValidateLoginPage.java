package com.travelTest.TestNG;

import org.testng.annotations.Test;

import com.travelTest.Repo.LoginRepo;

public class ValidateLoginPage extends ValidateBrowserPage {
	
	
	@Test   //test condition login
	public void login() throws Exception {
		r = new LoginRepo(w);
		Thread.sleep(2000);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail("swatisagale20@atomicmail.com");
		Thread.sleep(2000);
		r.sendPassword("Swati@12345");
		Thread.sleep(2000);
		r.rememberMeCheck();
		Thread.sleep(2000);
		r.loginButton();
		Thread.sleep(8000);
		
	}

}
