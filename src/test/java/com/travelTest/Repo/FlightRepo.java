package com.travelTest.Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightRepo {
	WebDriver w;
	public FlightRepo(WebDriver wd) {
		this.w = wd;
	}
//	Element
	By flights = By.linkText("Flights");
	By Source = By.id("flight-source-dropdown");
	By destination = By.name("destination");
	By departureDate = By.cssSelector("input[data-testid=\"flight-departure-date-input\"]");
	By searchFlightBtn = By.cssSelector("button[data-testid=\"flight-search-button\"]");
	
//	user action
	public void flights() {
		w.findElement(flights).click();
	}
	public void flightsSource(String visibleText) {
		Select s = new Select(w.findElement(Source));
		s.selectByVisibleText(visibleText);
	}
	public void flightsDestination(String visibleText) {
		Select s = new Select(w.findElement(destination));
		s.selectByVisibleText(visibleText);
	}
	public void departureDate(String mmddyyyy) {
		w.findElement(departureDate).sendKeys(mmddyyyy);
	}
	public void searchFlights() {
		w.findElement(searchFlightBtn).click();
	}
}
