package com.travelTest.TestNG;

import org.testng.annotations.Test;

import com.travelTest.DataProvider.Login;
import com.travelTest.Repo.LoginRepo;

public class ValidateLoginWithInvalidAndValidData extends ValidateBrowserPage {
	
	@Test(dataProviderClass = Login.class , dataProvider = "LoginTestData")  //test condition login
	public void login(String email , String Password) throws Exception {
		r = new LoginRepo(w);
		Thread.sleep(2000);
		r.loginLink();
		Thread.sleep(2000);
		r.sendEmail(email);
		Thread.sleep(2000);
		r.sendPassword(Password);
		Thread.sleep(2000);
		r.rememberMeCheck();
		Thread.sleep(2000);
		r.loginButton();
		Thread.sleep(8000);
	
	}

}
