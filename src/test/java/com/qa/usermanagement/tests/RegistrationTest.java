package com.qa.usermanagement.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.usermanagement.base.BaseTest;
import com.qa.usermanagement.testdata.RegistrationTestData;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("UserManagement-1.0.1")
@Feature("SRS-1.0.1_Registration")
@Story("FS-1.0.1_Registration")
public class RegistrationTest extends BaseTest {
	
	@Owner("VaraPrasad_ATE001")
	@Severity(SeverityLevel.CRITICAL)
	@Description("getIntoRegistrationPage validates preConditions")	
	@BeforeClass
	public void getIntoRegistrationPage() {
		
		registrationPg=loginPg.navigateToRegistrationPage();
		Allure.step("Getting into registrationPage is executed");
		ChainTestListener.log("Getting into registrationPage is executed");
		
	}
	
	@Owner("VaraPrasad_ATE001")
	@Severity(SeverityLevel.CRITICAL)
	@Description("registrationSmokeTest validates all the elements in the UI Page")	
	@Test(priority=Integer.MIN_VALUE)
	public void registrationSmokeTest() {
		boolean usnElementRes=registrationPg.checkuserNameElement();
		if(usnElementRes) {
			Assert.assertTrue(usnElementRes);
			Reporter.log("usnElementRes is True",true);
			ChainTestListener.log("usnElementRes is True");
			Allure.step("usnElementRes is True");

		}else {
			Reporter.log("usnElementRes is False",true);
			ChainTestListener.log("usnElementRes is False");
			Allure.step("usnElementRes is False");
		}
		
		boolean pwdElementRes=registrationPg.checkpwdElementDisplayed();
		if(pwdElementRes) {
			Assert.assertTrue(pwdElementRes);
			Reporter.log("pwdElementRes is True",true);
			ChainTestListener.log("pwdElementRes is True");
			Allure.step("pwdElementRes is True");
		}else {
			Reporter.log("pwdElementRes is False",true);
			ChainTestListener.log("pwdElementRes is False");
			Allure.step("pwdElementRes is False");

		}
		
		boolean fullNameElementRes=registrationPg.checkfullnameElementDisplayed();
		if(fullNameElementRes) {
			Assert.assertTrue(fullNameElementRes);
			Reporter.log("fullNameElementRes is True",true);
			ChainTestListener.log("fullNameElementRes is True");
			Allure.step("fullNameElementRes is True");
		}else {
			Reporter.log("fullNameElementRes is False",true);
			ChainTestListener.log("fullNameElementRes is False");
			Allure.step("fullNameElementRes is False");

		}
		
		boolean emailElementRes=registrationPg.checkemailElementDisplayed();
		if(emailElementRes) {
			Assert.assertTrue(emailElementRes);
			Reporter.log("emailElementRes is True",true);
			ChainTestListener.log("emailElementRes is True");
			Allure.step("emailElementRes is True");
		}else {
			Reporter.log("emailElementRes is False",true);
			ChainTestListener.log("emailElementRes is False");
			Allure.step("emailElementRes is False");

		}
		
		boolean goToLoginElementRes=registrationPg.checkgoToLoginElementDisplayed();
		if(goToLoginElementRes) {
			Assert.assertTrue(goToLoginElementRes);
			Reporter.log("goToLoginElementRes is True",true);
			ChainTestListener.log("goToLoginElementRes is True");
			Allure.step("goToLoginElementRes is True");
		}else {
			Reporter.log("goToLoginElementRes is False",true);
			ChainTestListener.log("goToLoginElementRes is False");
			Allure.step("goToLoginElementRes is False");

		}
		boolean submitBtnElementRes=registrationPg.checksubBtnElementDisplayed();
		if(submitBtnElementRes) {
			Assert.assertTrue(submitBtnElementRes);
			Reporter.log("submitBtnElementRes is True",true);
			ChainTestListener.log("submitBtnElementRes is True");
			Allure.step("submitBtnElementRes is True");
		}else {
			Reporter.log("submitBtnElementRes is False",true);
			ChainTestListener.log("submitBtnElementRes is False");
			Allure.step("submitBtnElementRes is False");

		}
		Allure.step("registrationSmokeTest is executed");
		ChainTestListener.log("registrationSmokeTest is executed");
		
	}
	
	@Owner("VaraPrasad_ATE001")
	@Severity(SeverityLevel.CRITICAL)
	@Description("createUser validates newUser Creation Functionality")
	
	
	@Test(invocationCount=1,dependsOnMethods="registrationSmokeTest",dataProvider="generateData",dataProviderClass=RegistrationTestData.class)
	public void createUser(String username , String fullname , String email , String password) {
		
	String confirmationMsg=	registrationPg.doRegistration(username,fullname,email,password);
	Assert.assertEquals(confirmationMsg,"Registration Successfully" );
	Allure.step("createUser method is executed");
	Reporter.log("createUser method is executed");
	}

}
