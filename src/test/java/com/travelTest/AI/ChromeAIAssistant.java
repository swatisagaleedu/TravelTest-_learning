package com.travelTest.AI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class ChromeAIAssistant {

	
	    WebDriver driver;
	    WebDriverWait wait;

	    @BeforeMethod
	    public void setup() {
	        // Ensure you have the ChromeDriver executable in your path
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        // Navigate to your application URL
	        driver.get("https://travel-test-bug.vercel.app/login");
	    }

	    @Test
	    public void testLoginFlow() {
	        // 1. Find and fill the Email field
	        WebElement emailInput = driver.findElement(By.id("login-email-input"));
	        emailInput.sendKeys("user@example.com");

	        // 2. Find and fill the Password field
	        WebElement passwordInput = driver.findElement(By.id("login-password-input"));
	        passwordInput.sendKeys("yourSecurePassword123");

	        // 3. Optional: Check "Remember Me"
	        WebElement rememberMeCheckbox = driver.findElement(By.id("login-remember-checkbox"));
	        if (!rememberMeCheckbox.isSelected()) {
	            rememberMeCheckbox.click();
	        }

	        // 4. Wait for the Login button to be clickable
	        // The button has 'opacity-50 cursor-not-allowed', so we wait for it to become active
	        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
	            By.cssSelector("button[type='submit']")
	        ));

	        // 5. Click Login
	        loginButton.click();

	        // 6. Verification: Check if login was successful (e.g., URL change or dashboard element presence)
	        wait.until(ExpectedConditions.urlContains("https://travel-test-bug.vercel.app/"));
	        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed or didn't redirect to dashboard.");
	    }

	    @AfterMethod
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	

}
