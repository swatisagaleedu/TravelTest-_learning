package com.travelTest.AI;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GithubCopilot {
	
	WebDriver w;
	
	@BeforeMethod
	public void launchAnChromeBrowser() {
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://travel-test-bug.vercel.app/login");
	}
	@Test
	public void loginTest() throws Exception {
		w.findElement(By.id("login-email-input")).sendKeys("swatisan@gmail.com");
		w.findElement(By.id("login-password-input")).sendKeys("Swati@123");
		w.findElement(By.cssSelector("button[data-testid=\"login-submit-button\"]")).click();
		Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/");
	}
	@AfterMethod
	public void closeBrowser() {
		if(w != null) {
			w.quit();
			
		}
		
	}

}
