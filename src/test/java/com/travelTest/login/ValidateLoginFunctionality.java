package com.travelTest.login;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.Repo.LoginRepo;

public class ValidateLoginFunctionality {
	
public static void main(String[] args) throws Exception {
	
	BrowserOption b = new BrowserOption();
	LoginRepo r = new LoginRepo(b.launchBrowser("chrome"));
	b.NavigateToProvideURL("https://travel-test-khaki.vercel.app/");
	Thread.sleep(2000);
	r.loginLink();
	Thread.sleep(2000);
	r.sendEmail("swatisagale20@atomicmail.io");
	Thread.sleep(2000);
	r.sendPassword("Swati@1234");
	Thread.sleep(2000);
	r.show();
	Thread.sleep(2000);
	r.rememberMeCheck();
	Thread.sleep(2000);
	r.loginButton();
}



	
		
		
			
			
			
		
	}


