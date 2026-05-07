package com.qa.usermanagement.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.usermanagement.base.BaseTest;
import com.qa.usermanagement.testdata.RegisterTestData;
import com.qa.usermanagement.testdata.RegistrationTestData;

public class RegisterTest extends BaseTest {
	
	@Test(priority=Integer.MIN_VALUE)
	public void registrationSmokeTest() {
		boolean firstNameElementRes=registerPg.checkfirstNameElement();
		if(firstNameElementRes) {
			Assert.assertTrue(firstNameElementRes);
			Reporter.log("firstNameElementRes is True",true);
			ChainTestListener.log("firstNameElementRes is True");
		}else {
			Reporter.log("firstNameElementRes is False",true);
			ChainTestListener.log("firstNameElementRes is False");

		}

		boolean lastNameElementRes=registerPg.checkLastNameElement();
		if(lastNameElementRes) {
			Assert.assertTrue(lastNameElementRes);
			Reporter.log("lastNameElementRes is True",true);
			ChainTestListener.log("lastNameElementRes is True");
		}else {
			Reporter.log("lastNameElementRes is False",true);
			ChainTestListener.log("lastNameElementRes is False");

		}

		
		boolean emailElementRes=registerPg.checkEmailElement();
		if(emailElementRes) {
			Assert.assertTrue(emailElementRes);
			Reporter.log("emailElementRes is True",true);
			ChainTestListener.log("emailElementRes is True");
		}else {
			Reporter.log("emailElementRes is False",true);
			ChainTestListener.log("emailElementRes is False");

		}
		
		boolean passwordElementRes=registerPg.checkPasswordElement();
		if(passwordElementRes) {
			Assert.assertTrue(passwordElementRes);
			Reporter.log("passwordElementRes is True",true);
			ChainTestListener.log("passwordElementRes is True");
		}else {
			Reporter.log("passwordElementRes is False",true);
			ChainTestListener.log("passwordElementRes is False");

		}

		boolean confirmPasswordElementRes=registerPg.checkConfirmPasswordElement();
		if(confirmPasswordElementRes) {
			Assert.assertTrue(confirmPasswordElementRes);
			Reporter.log("confirmPasswordElementRes is True",true);
			ChainTestListener.log("confirmPasswordElementRes is True");
		}else {
			Reporter.log("confirmPasswordElementRes is False",true);
			ChainTestListener.log("confirmPasswordElementRes is False");

		}
		
		boolean genderMaleElementRes=registerPg.checkGenderMaleElement();
		if(genderMaleElementRes) {
			Assert.assertTrue(genderMaleElementRes);
			Reporter.log("genderMaleElementRes is True",true);
			ChainTestListener.log("genderMaleElementRes is True");
		}else {
			Reporter.log("genderMaleElementRes is False",true);
			ChainTestListener.log("genderMaleElementRes is False");

		}
		
		boolean genderFemaleElementRes=registerPg.checkGenderFemaleElement();
		if(genderFemaleElementRes) {
			Assert.assertTrue(genderFemaleElementRes);
			Reporter.log("genderFemaleElementRes is True",true);
			ChainTestListener.log("genderFemaleElementRes is True");
		}else {
			Reporter.log("genderFemaleElementRes is False",true);
			ChainTestListener.log("genderFemaleElementRes is False");

		}

		
		boolean registerElementRes=registerPg.checkRegistrationElement();
		if(registerElementRes) {
			Assert.assertTrue(registerElementRes);
			Reporter.log("registerElementRes is True",true);
			ChainTestListener.log("registerElementRes is True");
		}else {
			Reporter.log("registerElementRes is False",true);
			ChainTestListener.log("registerElementRes is False");

		}

	}
	@Test(invocationCount=1,dependsOnMethods="registrationSmokeTest",dataProvider="generateData",dataProviderClass=RegisterTestData.class)
	public void createUser(String firstname,String lastname,String email,String password,String confirmpassword) {
		
	String registerSuccess = registerPg.doRegistrations(firstname, lastname, email, password, password);
	Assert.assertEquals(registerSuccess,"Your registration completed" );
  }
	@Test
	public void logoutUser() {
		registerPg.doLogout();
	}
	@Test
	public void retryRegisterUser() {
		registerPg.doRegister();
	}
	
	@Test(dependsOnMethods="retryRegisterUser")
	public void registerUser() {
		String registerFailure=registerPg.doRegistrations("Vara", "Prasad", "pinakpani777@gmail.com", "Chinna@123", "Chinna@123");
		Assert.assertEquals(registerFailure, "The specified email already exists");
		
	}

}
