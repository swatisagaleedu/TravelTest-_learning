package com.travelTest.Register;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.Repo.RegRepo;

public class ValidateRegistration {
 
	public static void main(String[] args) throws Exception {

		BrowserOption b = new BrowserOption();
		RegRepo r = new RegRepo(b.launchBrowser("chrome"));
		b.NavigateToProvideURL("https://travel-test-bug.vercel.app/");
		Thread.sleep(2000);
		r.regLink();
		Thread.sleep(2000);
		r.fullName("Vamika Sagale");
		Thread.sleep(2000);
		r.email("vamisagale20@gmail.com");
		Thread.sleep(2000);
		r.phone("7718071517");
		Thread.sleep(2000);
		r.gender("Female");
		Thread.sleep(2000);
		r.password("123456789");
		Thread.sleep(2000);
		r.confirmPassword("123456789");
		Thread.sleep(2000);
		r.checkTermAndCondition();
		Thread.sleep(2000);
		r.Register();
		Thread.sleep(2000);
		
}

}
