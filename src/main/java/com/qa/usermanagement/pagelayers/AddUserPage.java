package com.qa.usermanagement.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AddUserPage extends BasePage {
	
	
final private By fullNameTf=By.id("fullname");
final private By emailTf=By.id("email");
final private By phoneNoTf=By.id("phone");
final private By genderMaleBtn=By.id("gender-male");
final private By genderFemaleBtn=By.id("gender-female");
final private By languageBox=By.id("language-english");
final private By addUserBtn=By.id("button-add-user-submit");
final private By addUserSuccess=By.id("add-user-success-message");
final private By addUserFailure=By.id("add-user-failure-message");




public AddUserPage(WebDriver driver) {
	super(driver);
}


public Boolean checkEmailElement() {
	if(elementActions.checkElementDisplayed("checkEmailElement", emailTf)) {
		Reporter.log("checkEmailElementDisplayed | Passed",true);
		if(elementActions.checkElementEnabled("checkEmailElement", emailTf)) {
			Reporter.log("checkEmailElementEnabled | Passed",true);
           return true;
		}
	}
	return false;
	
}

public Boolean checkPhoneNoTfElement() {
	if(elementActions.checkElementDisplayed("checkPhoneNoTfElement", phoneNoTf)) {
		Reporter.log("checkPhoneNoTfElementDisplayed | Passed",true);
		if(elementActions.checkElementEnabled("checkPhoneNoTfElement", phoneNoTf)) {
			Reporter.log("checkPhoneNoTfElementEnabled | Passed",true);
           return true;
		}
	}
	return false;
	
}


public Boolean checkFullNameElement() {
	if(elementActions.checkElementDisplayed("checkFullNameElement", fullNameTf)) {
		Reporter.log("checkFullNameElementDisplayed | Passed",true);
		if(elementActions.checkElementEnabled("checkFullNameElement", fullNameTf)) {
			Reporter.log("checkFullNameElementEnabled | Passed",true);
           return true;
		}
	}
	return false;
	
}

public Boolean checkGenderMaleBtnElement() {
	if(elementActions.checkElementDisplayed("checkGenderMaleBtnElement", genderMaleBtn)) {
		Reporter.log("checkGenderMaleBtnElementDisplayed | Passed",true);
		if(elementActions.checkElementEnabled("checkGenderMaleBtnElement", genderMaleBtn)) {
			Reporter.log("checkGenderMaleBtnElementEnabled | Passed",true);
           return true;
		}
	}
	return false;
	
}

public Boolean checkGenderFemaleBtnElement() {
	if(elementActions.checkElementDisplayed("checkGenderFemaleBtnElement", genderFemaleBtn)) {
		Reporter.log("checkGenderFemaleBtnElementDisplayed | Passed",true);
		if(elementActions.checkElementEnabled("checkGenderFemaleBtnElement", genderFemaleBtn)) {
			Reporter.log("checkGenderFemaleBtnElementEnabled | Passed",true);
           return true;
		}
	}
	return false;
	
}

public Boolean checkLanguageBoxElement() {
	if(elementActions.checkElementDisplayed("checkLanguageBoxElement", languageBox)) {
		Reporter.log("checkLanguageBoxElementDisplayed | Passed",true);
		if(elementActions.checkElementEnabled("checkLanguageBoxElement", languageBox)) {
			Reporter.log("checkLanguageBoxElementEnabled | Passed",true);
           return true;
		}
	}
	return false;
	
}

public Boolean checkAddUserBtn() {
	if(elementActions.checkElementDisplayed("checkAddUserBtn", addUserBtn)) {
		Reporter.log("checkAddUserBtnElementDisplayed | Passed",true);
		if(elementActions.checkElementEnabled("checkAddUserBtn", addUserBtn)) {
			Reporter.log("checkAddUserBtnElementEnabled | Passed",true);
           return true;
		}
	}
	return false;
	
}


public String addNewUser(String fullname,String email,String phoneNumber) {
	
	Reporter.log("The entered Values are :\t" +fullname+"\t"+email+"\t"+phoneNumber+"\t",true);
	
    

elementActions.enterValues(fullNameTf,fullname);
elementActions.enterValues(emailTf,email);
elementActions.enterValues(phoneNoTf,phoneNumber);	

elementActions.doClick(genderMaleBtn);
elementActions.doClick(languageBox);
elementActions.doClick(addUserBtn);

//return "Method Executed";


 boolean res=elementActions.checkElementDisplayed("addNewUser", addUserSuccess);
 if(res) {
 String textValue=	elementActions.fetchElementText("addNewUser", addUserSuccess);
 Reporter.log("The text value of addUserSuccess is \t" +textValue,true);
 return textValue;
 }else {
	boolean res1=elementActions.checkElementDisplayed("addNewUser", addUserFailure);
	if(res) {
	String textValue=elementActions.fetchElementText("addNewUser",addUserFailure );
	Reporter.log("The text value of addUserFailure is \t" +textValue,true);
	return textValue;
	
     }
}
return "Method Executed";



    }

}
	
