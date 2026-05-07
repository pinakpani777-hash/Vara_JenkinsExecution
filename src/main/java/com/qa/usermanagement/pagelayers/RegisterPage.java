package com.qa.usermanagement.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class RegisterPage extends BasePage {
	
	final private By firstNameTf=By.id("FirstName");
	final private By lastNameTf=By.id("LastName");
	final private By emailTf=By.id("Email");
	final private By passwordTf=By.id("Password");
	final private By confirmPasswordTf=By.id("ConfirmPassword");
	final private By genderMaleBtn=By.id("gender-male");
	final private By genderFemaleBtn=By.id("gender-female");
	final private By registerBtn=By.id("register-button");
	final private By registerSuccess=By.xpath("//div[contains(text(),'            Your registration completed')]");
	final private By registerFailure=By.xpath("//li[contains(text(),'The specified email already exists')]");
	final private By logoutBtn=By.xpath("//a[.='Log out']");
	final private By registerLink=By.xpath("//a[.='Register']");
	
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	
	public Boolean checkfirstNameElement() {
		if(elementActions.checkElementDisplayed("checkfirstNameElement", firstNameTf)) {
			Reporter.log("checkfirstNameElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkfirstNameElement", firstNameTf)) {
				Reporter.log("checkfirstNameElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
		
	}
	
	public Boolean checkEmailElement() {
		if(elementActions.checkElementDisplayed("checkEmailElement", lastNameTf)) {
			Reporter.log("checkEmailElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkEmailElement", lastNameTf)) {
				Reporter.log("checkEmailElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
		
	}
	
	public Boolean checkLastNameElement() {
		if(elementActions.checkElementDisplayed("checkLastNameElement", emailTf)) {
			Reporter.log("checkLastNameElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkLastNameElement", emailTf)) {
				Reporter.log("checkLastNameElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
		
	}
	
	public Boolean checkPasswordElement() {
		if(elementActions.checkElementDisplayed("checkPasswordElement", passwordTf)) {
			Reporter.log("checkPasswordElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkPasswordElement", passwordTf)) {
				Reporter.log("checkPasswordElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
		
	}
	
	
	public Boolean checkConfirmPasswordElement() {
		if(elementActions.checkElementDisplayed("checkConfirmPasswordElement", confirmPasswordTf)) {
			Reporter.log("checkConfirmPasswordElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkConfirmPasswordElement", confirmPasswordTf)) {
				Reporter.log("checkConfirmPasswordElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
		
	}
	
	
	public Boolean checkGenderMaleElement() {
		if(elementActions.checkElementDisplayed("checkGenderMaleElement", genderMaleBtn)) {
			Reporter.log("checkGenderMaleElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkGenderMaleElement", genderMaleBtn)) {
				Reporter.log("checkGenderMaleElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
		
	}
	
	public Boolean checkGenderFemaleElement() {
		if(elementActions.checkElementDisplayed("checkGenderFemaleElement", genderFemaleBtn)) {
			Reporter.log("checkGenderFemaleElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkGenderFemaleElement", genderFemaleBtn)) {
				Reporter.log("checkGenderFemaleElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
		
	}
	
	public Boolean checkRegistrationElement() {
		if(elementActions.checkElementDisplayed("checkRegistrationElement", registerBtn)) {
			Reporter.log("checkRegistrationElementDisplayed | Passed",true);
			if(elementActions.checkElementEnabled("checkRegistrationElement", registerBtn)) {
				Reporter.log("checkRegistrationElementEnabled | Passed",true);
               return true;
			}
		}
		return false;
		
	}
	
	
public String doRegistrations(String firstname,String lastname,String email,String password,String confirmpassword) {
		
		Reporter.log("The entered Values are :\t" +firstname+"\t"+lastname+"\t"+email+"\t"+password+"\t"+confirmpassword+"\t",true);
	
		elementActions.enterValues(firstNameTf,firstname);
		elementActions.enterValues(lastNameTf,lastname);
		elementActions.enterValues(emailTf,email);	
		elementActions.enterValues(passwordTf,password);
		elementActions.enterValues(confirmPasswordTf,confirmpassword);
		elementActions.doClick(genderMaleBtn);
		elementActions.doClick(registerBtn);
		
		
		boolean res=elementActions.checkElementDisplayed("doRegistrations", registerSuccess);
		if(res) {
		String textValue=	elementActions.fetchElementText("doRegistrations", registerSuccess);
		Reporter.log("The text value of registrationSuccess is \t" +textValue,true);
		return textValue;
		}else {
			boolean res1=elementActions.checkElementDisplayed("doRegistrations", registerFailure);
			if(res1) {
			String textValue1=elementActions.fetchElementText("doRegistrations", registerFailure);
			Reporter.log("The text value of registrationFailure is \t" +textValue1,true);
			return textValue1;
			
		     }
		}
		return "Method Executed";	
		
    }

   public void doLogout() {
	   elementActions.doClick(logoutBtn);
   }
   
   public void doRegister() {
	   elementActions.doClick(registerLink);
   }
   
}
