package com.travelTest.Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginRepo {
//	Without page Factory 
private WebDriver w ;
public LoginRepo(WebDriver wd) {
//	var = Value ;
	w = wd;
}
//  Element
private By LoginLink = By.linkText("Login"); 
private By Email = By.cssSelector("input[id=\"login-email-input\"]");
private By password = By.cssSelector("input[id=\"login-password-input\"]");
private By showOrHide = By.cssSelector("button[data-testid=\"login-password-toggle-button\"]");
private By RememberMe = By.cssSelector("input[id=\"login-remember-checkbox\"]");
private By forgetPassword = By.cssSelector("a[data-testid=\"login-forgot-password-link\"]");
private By loginButton = By.cssSelector("button[data-testid=\"login-submit-button\"]");

// User Action
public void loginLink() {
	w.findElement(LoginLink).click();
}
public void sendEmail(String UserEmail) {
	w.findElement(Email).sendKeys(UserEmail);
}
public void clearEmail() {
	w.findElement(Email).clear();
}
public void sendPassword(String pass) {
	w.findElement(password).sendKeys(pass);
}
public void clearPassword() {
	w.findElement(password).clear();
}
public void show() {
	w.findElement(showOrHide).click();
}
public void hide() {
	show();
	w.findElement(showOrHide).click();
}
public void rememberMeCheck() {
	w.findElement(RememberMe).click();
}
public void rememberMeUNCheck() {
	rememberMeCheck();
	w.findElement(RememberMe).click();
}
public void forgetPassword() {
	w.findElement(forgetPassword).click();
}
public void loginButton() {
	w.findElement(loginButton).click();
}
	
}
