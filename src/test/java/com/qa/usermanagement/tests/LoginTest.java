package com.qa.usermanagement.tests;

import org.testng.Assert;



import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.usermanagement.base.BaseTest;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Epic("UserManagement-1.0.1")
@Feature("SRS-1.0.1_Login")
@Story("FS-1.0.1_Login")
public class LoginTest extends BaseTest {
	
	
	@Owner("VaraPrasad_ATE001")
	@Severity(SeverityLevel.CRITICAL)
	@Description("loginSmokeTest validates all elements in the UI Page")
	@Test(priority=Integer.MIN_VALUE)
	public void loginSmokeTest() {
		
	boolean usnElementFlag=loginPg.checkUserNameElementDisplayed();
		Assert.assertTrue(usnElementFlag);
		Reporter.log("usnElementFlag is true \t | checkUserNameElementDisplayed passed",true);
		ChainTestListener.log("usnElementFlag is true \t | checkUserNameElementDisplayed passed");
		Allure.step("usnElementFlag is true \t | checkUserNameElementDisplayed passed");
		
		boolean pwdElementFlag=loginPg.checkPwdElementDisplayed();
		Assert.assertTrue(pwdElementFlag);
		Reporter.log("pwdElementFlag is true \t | checkPwdElementDisplayed passed",true);
		ChainTestListener.log("pwdElementFlag is true \t | checkPwdElementDisplayed passed");
		Allure.step("pwdElementFlag is true \\t | checkPwdElementDisplayed passed");

		boolean loginBtnElementFlag=loginPg.checkLoginBtnElementDisplayed();
		Assert.assertTrue(loginBtnElementFlag);
		Reporter.log("loginBtnElementFlag is true \t | checkLoginBtnElementDisplayed passed",true);
		ChainTestListener.log("loginBtnElementFlag is true \t | checkLoginBtnElementDisplayed passed");
		Allure.step("loginBtnElementFlag is true \\t | checkLoginBtnElementDisplayed passed");

		boolean createAccLinkElementFlag=loginPg.checkCreateAccLinkElementDisplayed();
		Assert.assertTrue(createAccLinkElementFlag);
		Reporter.log("createAccLinkElementFlag is true \t | checkCreateAccLinkElementDisplayed passed",true);
		ChainTestListener.log("createAccLinkElementFlag is true \t | checkCreateAccLinkElementDisplayed passed");
		Allure.step("createAccLinkElementFlag is true \\t | checkCreateAccLinkElementDisplayed passed");
		
		
		boolean usnElementFlag1=loginPg.checkUserNameElementEnabled();
		Assert.assertTrue(usnElementFlag1);
		Reporter.log("usnElementFlag1 is true \t | checkUserNameElementEnabled passed",true);
		ChainTestListener.log("usnElementFlag1 is true \t | checkUserNameElementEnabled passed");
		Allure.step("usnElementFlag1 is true \\t | checkUserNameElementEnabled passed");
		
		boolean pwdElementFlag1=loginPg.checkPwdElementEnabled();
		Assert.assertTrue(pwdElementFlag1);
		Reporter.log("pwdElementFlag1 is true \t | checkPwdElementEnabled passed",true);
		ChainTestListener.log("pwdElementFlag1 is true \t | checkPwdElementEnabled passed");
		Allure.step("pwdElementFlag1 is true \\t | checkPwdElementEnabled passed");

		boolean loginBtnElementFlag1=loginPg.checkLoginBtnElementEnabled();
		Assert.assertTrue(loginBtnElementFlag1);
		Reporter.log("loginBtnElementFlag1 is true \t | checkLoginBtnElementEnabled passed",true);
		ChainTestListener.log("loginBtnElementFlag1 is true \t | checkLoginBtnElementEnabled passed");
		Allure.step("loginBtnElementFlag1 is true \\t | checkLoginBtnElementEnabled passed");

		boolean createAccLinkElementFlag1=loginPg.checkCreateAccLinkElementEnabled();
		Assert.assertTrue(createAccLinkElementFlag1);
		Reporter.log("createAccLinkElementFlag1 is true \t | checkCreateAccLinkElementEnabled passed",true);
		ChainTestListener.log("createAccLinkElementFlag1 is true \t | checkCreateAccLinkElementEnabled passed");
		Allure.step("createAccLinkElementFlag1 is true \\t | checkCreateAccLinkElementEnabled passed");
		
	}	
	@Test(dependsOnMethods="loginSmokeTest")
	
	@Owner("VaraPrasad_ATE001")
	@Severity(SeverityLevel.CRITICAL)
	@Description("validateLogin validates Login Functionality")
	public void validateLogin() {
		log.info("I am validating login now");
	String	confirmationMsg=loginPg.doLogin("VaraPrasad", "Varaprasad@123");
	Assert.assertEquals(confirmationMsg, "Invalid username or password.");
		ChainTestListener.log("validateLogin test is Passed");
		Allure.step("validateLogin test is Passed");
		log.info("validateLogin test is Passed");
		log.error("validate login test is failed ");
		
	}	
	
}
