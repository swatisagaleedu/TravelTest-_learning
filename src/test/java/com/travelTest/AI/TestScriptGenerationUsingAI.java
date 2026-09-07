package com.travelTest.AI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScriptGenerationUsingAI {
		
	    WebDriver driver;

	    @BeforeMethod
	    public void setUp() {

	        // Launch Chrome browser
	        driver = new ChromeDriver();

	        // Maximize browser
	        driver.manage().window().maximize();

	        // Open login page
	        driver.get("https://travel-test-bug.vercel.app/login");
	    }

	    @Test
	    public void loginTest() throws Exception {

	        // Enter Email
	        driver.findElement(By.id("login-email-input"))
	              .sendKeys("test@gmail.com");
	        Thread.sleep(2000);

	        // Enter Password
	        driver.findElement(By.id("login-password-input"))
	              .sendKeys("Test@123");
	        Thread.sleep(2000);

	        // Click Login button
	        driver.findElement(By.cssSelector("button[data-testid=\"login-submit-button\"]"))
	              .click();
	        Thread.sleep(2000);
	    }

	    @AfterMethod
	    public void tearDown() {

	        // Close browser
	        driver.quit();
	    }
	
}
