package com.qa.usermanagement.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import io.qameta.allure.Step;

public class RegistrationPage extends BasePage {
	
final private By userNameTf=By.id("username");
final private By fullnameTf=By.id("fullname");
final private By emailTf=By.id("email");
final private By pwdTf=By.id("password");
final private By subBtn=By.id("submit");
final private By goToLogin=By.id("link-register-to-login");
final private By registrationSuccess=By.id("registration-success-message");
final private By registrationFailure=By.id("registration-error-message");





	public RegistrationPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@Step("checkuserNameElementDisplayed & Enabled")
	public Boolean checkuserNameElement() {
		if(elementActions.checkElementDisplayed("checkuserNameElement", userNameTf)) {
			Reporter.log("checkuserNameElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkuserNameElement", userNameTf)) {
				Reporter.log("checkuserNameElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
		
	}
	
	@Step("checkfullnameElementDisplayed & Enabled")
	public Boolean checkfullnameElementDisplayed() {
		if(elementActions.checkElementDisplayed("checkfullnameElementDisplayed", fullnameTf)) {
			Reporter.log("checkfullNameElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkfullnameElementDisplayed", fullnameTf)) {
				Reporter.log("checkfullNameElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
	}
	
	@Step("checkemailElementDisplayed & Enabled")
	public Boolean checkemailElementDisplayed() {
		if(elementActions.checkElementDisplayed("checkemailElementDisplayed", emailTf)) {
			Reporter.log("checkemailElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkemailElementDisplayed", emailTf)) {
				Reporter.log("checkemailElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
	}
	
	@Step("checkpwdElementDisplayed & Enabled")
	public Boolean checkpwdElementDisplayed() {
		if(elementActions.checkElementDisplayed("checkpwdElementDisplayed", pwdTf)) {
			Reporter.log("checkpwdElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkpwdElementDisplayed", pwdTf)) {
				Reporter.log("checkpwdElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
	}
	
	@Step("checksubBtnElementDisplayed & Enabled")
	public Boolean checksubBtnElementDisplayed() {
		if(elementActions.checkElementDisplayed("checksubBtnElementDisplayed", subBtn)) {
			Reporter.log("checksubBtnElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checksubBtnElementDisplayed", subBtn)) {
				Reporter.log("checksubBtnElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
	}
	
	@Step("checkgoToLoginElementDisplayed & Enabled")
	public Boolean checkgoToLoginElementDisplayed() {
		if(elementActions.checkElementDisplayed("checkgoToLoginElementDisplayed", goToLogin)) {
			Reporter.log("checkgoToLoginElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkgoToLoginElementDisplayed", goToLogin)) {
				Reporter.log("checkgoToLoginElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
	}
	
	
	
	public String doRegistration(String usn,String pwd,String email,String fullName) {
		
		Reporter.log("The entered Values are :\t" +usn+"\t"+pwd+"\t"+email+"\t"+fullName+"\t",true);
	
		elementActions.enterValues(userNameTf,usn);
		elementActions.enterValues(pwdTf,pwd);
		elementActions.enterValues(emailTf,email);	
		elementActions.enterValues(fullnameTf,fullName);
		elementActions.doClick(subBtn);
		
		boolean res=elementActions.checkElementDisplayed("doRegistration", registrationSuccess);
		if(res) {
		String textValue=	elementActions.fetchElementText("doRegistration", registrationSuccess);
		Reporter.log("The text value of registrationSuccess is \t" +textValue,true);
		return textValue;
		}else {
			boolean res1=elementActions.checkElementDisplayed("doRegistration", registrationFailure);
			if(res) {
			String textValue=elementActions.fetchElementText("doRegistration", registrationFailure);
			Reporter.log("The text value of registrationFailure is \t" +textValue,true);
			return textValue;
			
		     }
		}
		return "Method Executed";

		
		
	}

}
