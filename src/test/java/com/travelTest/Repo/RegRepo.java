package com.travelTest.Repo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegRepo {
	// class --> cucumber
//	method --> Testng
//	variable --> POM
	
	public RegRepo(WebDriver w) {
		PageFactory.initElements(w, this);
	}
	@FindBy(linkText = "Register") WebElement regLink;
	@FindBy(id = "register-full-name-input") WebElement fullName;
	@FindBy(id = "register-email-input") WebElement email;
	@FindBy(css = "input[data-testid=\"register-phone-input\"]") WebElement phone;
	@FindBy(css = "input[name=\"gender\"]") List<WebElement> genders;
	@FindBy(css = "input[name=\"password\"]") WebElement password;
	@FindBy(css = "input[data-testid=\"register-confirm-password-input\"]") WebElement confirmPassword;
	@FindBy(id = "register-terms-checkbox") WebElement termAndCondition;
	@FindBy(css= "button[data-testid=\"register-submit-button\"]") WebElement registerBtn;
	public void regLink() {
		regLink.click();
	}
	public void fullName(String fullName) {
		this.fullName.sendKeys(fullName);
	}
	public void email(String emailID) {
		email.sendKeys(emailID);
	}
	public void phone(String phoneNumber) {
		phone.sendKeys(phoneNumber);
	}
	public void gender(String gender) {
		for(WebElement gen : genders) {
			if (gen.getAttribute("value").equalsIgnoreCase(gender)) {
				gen.click();
				break;
			}
		}
	}
      public void password(String password) {
	  this.password.sendKeys(password);
     }
     public void confirmPassword(String confirmPassword) {
	 this.confirmPassword.sendKeys(confirmPassword);
     }
     public void checkTermAndCondition() {
    	 termAndCondition.click();
    }
     public void UncheckTermAndCondition() {
    	 termAndCondition.click();
    	 termAndCondition.click();
     }
     public void Register() {
    	 registerBtn.click();
     }
}
