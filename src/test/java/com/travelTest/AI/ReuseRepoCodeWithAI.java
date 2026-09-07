package com.travelTest.AI;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.Repo.LoginRepo;

public class ReuseRepoCodeWithAI {

	public static void main(String[] args) throws Exception {

		BrowserOption bo = new BrowserOption();
		LoginRepo loginRepo = new LoginRepo(bo.launchBrowser("chrome"));
		Thread.sleep(2000);
		bo.NavigateToProvideURL("https://travel-test-bug.vercel.app/login");
		Thread.sleep(2000);
		loginRepo.sendEmail("AnujS@gmail.com");
		Thread.sleep(2000);
		loginRepo.sendPassword("Anuj@123");
		Thread.sleep(2000);
		loginRepo.loginButton();
		Thread.sleep(2000);
		bo.quit();


	}

}
