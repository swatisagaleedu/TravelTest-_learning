package com.travelTest.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.Repo.FlightRepo;
import com.travelTest.Repo.LoginRepo;

public class ValidateBrowserPage {
	
	 BrowserOption op;
	 LoginRepo r;
	 FlightRepo fr;
	 WebDriver w;
	
	@BeforeMethod
	public void launchBrowserAndNavigateToTravelTestSite() {
		op = new BrowserOption();
//		r = new LoginRepo(op.launchBrowser("chrome"));
		w = op.launchBrowser("chrome");
		op.NavigateToProvideURL("https://travel-test-bug.vercel.app/");
	}
	
	@AfterMethod
	public void tearBrowser() {
		w.quit();
	}

}
