package com.travelTest.login;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.Repo.LoginRepo;

public class ValidateLoginLink {

	public static void main(String[] args) throws Exception {
		
		SoftAssert soft = new SoftAssert();
		
		String arr[] = {"chrome","edge"};
		for (String browserName : arr) {
			BrowserOption b = new BrowserOption();
			LoginRepo r = new LoginRepo(b.launchBrowser(browserName));
			b.NavigateToProvideURL("https://travel-test-bug.vercel.app/");
			Thread.sleep(2000);
			r.loginLink();
	         Thread.sleep(2000);
	         
//			Assert.assertEquals(b.currentURL(), "https://travel-test-bug.vercel");
	         soft.assertEquals(b.currentURL(), "https://travel-test-bug.");
			
		}
		
		soft.assertAll();

	}

}
