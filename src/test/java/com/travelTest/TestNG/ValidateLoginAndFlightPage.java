package com.travelTest.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.travelTest.BrowserOption.BrowserOption;
import com.travelTest.Repo.FlightRepo;
import com.travelTest.Repo.LoginRepo;

public class ValidateLoginAndFlightPage {

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
	
	@Test
	public void serachFlights() throws Exception {
		fr = new FlightRepo(w);
		Thread.sleep(2000);
		fr.flights();
		Thread.sleep(2000);
		fr.flightsSource("New Delhi");
		Thread.sleep(2000);
		fr.flightsDestination("Jaipur");
		Thread.sleep(2000);
		fr.departureDate("08-22-2026");
		Thread.sleep(2000);
		fr.searchFlights();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearBrowser() {
		w.quit();
	}
	
}
