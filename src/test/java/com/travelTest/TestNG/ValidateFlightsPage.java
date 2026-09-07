package com.travelTest.TestNG;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.travelTest.Repo.FlightRepo;

public class ValidateFlightsPage extends ValidateBrowserPage {

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
		try {
			Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/login");
		}finally {
			TakesScreenshot tss = (TakesScreenshot) w;
			File screenshot = tss.getScreenshotAs(OutputType.FILE);
			LocalDateTime dt = LocalDateTime.now();
			File path = new File("./screenshot/src"+dt.getDayOfMonth()+"_"+dt.getMonthValue()+"_"+dt.getYear()+"_"+dt.getHour()+"_"+dt.getMinute()+"_"+dt.getSecond()+".png");
			FileHandler.copy(screenshot, path);
		}
	}
}
