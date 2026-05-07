package com.qa.usermanagement.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.usermanagement.base.BaseTest;
import com.qa.usermanagement.testdata.AddUserTestData;
import com.qa.usermanagement.testdata.RegistrationTestData;

public class AddUserTest extends BaseTest {
	
	@BeforeClass
	public void navigateToAddUserPage() {
		addPg=loginPg.navigateToAddUserPage();
	}
	
	@Test
	public void addNewUserSmokeTest() {
		boolean fullNameElementRes=addPg.checkFullNameElement();
		if(fullNameElementRes) {
			Assert.assertTrue(fullNameElementRes);
			Reporter.log("fullNameElementRes is True",true);
			ChainTestListener.log("fullNameElementRes is True");
		}else {
			Reporter.log("fullNameElementRes is False",true);
			ChainTestListener.log("fullNameElementRes is False");

		}
		
		
		boolean emailElementRes=addPg.checkEmailElement();
		if(emailElementRes) {
			Assert.assertTrue(emailElementRes);
			Reporter.log("emailElementRes is True",true);
			ChainTestListener.log("emailElementRes is True");
		}else {
			Reporter.log("emailElementRes is False",true);
			ChainTestListener.log("emailElementRes is False");

		}
	
		
		boolean phoneNoElementRes=addPg.checkPhoneNoTfElement();
		if(phoneNoElementRes) {
			Assert.assertTrue(phoneNoElementRes);
			Reporter.log("phoneNoElementRes is True",true);
			ChainTestListener.log("phoneNoElementRes is True");
		}else {
			Reporter.log("phoneNoElementRes is False",true);
			ChainTestListener.log("phoneNoElementRes is False");

		}
		
		boolean maleBtnElementRes=addPg.checkGenderMaleBtnElement();
		if(maleBtnElementRes) {
			Assert.assertTrue(maleBtnElementRes);
			Reporter.log("maleBtnElementRes is True",true);
			ChainTestListener.log("maleBtnElementRes is True");
		}else {
			Reporter.log("maleBtnElementRes is False",true);
			ChainTestListener.log("maleBtnElementRes is False");

		}
	
		
		boolean femaleBtnElementRes=addPg.checkGenderFemaleBtnElement();
		if(femaleBtnElementRes) {
			Assert.assertTrue(femaleBtnElementRes);
			Reporter.log("femaleBtnElementRes is True",true);
			ChainTestListener.log("femaleBtnElementRes is True");
		}else {
			Reporter.log("femaleBtnElementRes is False",true);
			ChainTestListener.log("femaleBtnElementRes is False");

		}
		

		boolean languageFieldElementRes=addPg.checkLanguageBoxElement();
		if(languageFieldElementRes) {
			Assert.assertTrue(languageFieldElementRes);
			Reporter.log("languageFieldElementRes is True",true);
			ChainTestListener.log("languageFieldElementRes is True");
		}else {
			Reporter.log("languageFieldElementRes is False",true);
			ChainTestListener.log("languageFieldElementRes is False");

		}
		
		boolean addUserBtnElementRes=addPg.checkAddUserBtn();
		if(addUserBtnElementRes) {
			Assert.assertTrue(addUserBtnElementRes);
			Reporter.log("addUserBtnElementRes is True",true);
			ChainTestListener.log("addUserBtnElementRes is True");
		}else {
			Reporter.log("addUserBtnElementRes is False",true);
			ChainTestListener.log("addUserBtnElementRes is False");
		}
	
	}
	
	@Test(invocationCount=1,dependsOnMethods="addNewUserSmokeTest",dataProvider="generateData",dataProviderClass=AddUserTestData.class)
	public void addUser(String fullname,String email,String phoneNumber) {
		
		String confirmationMsg=	addPg.addNewUser(fullname,email,phoneNumber);
		Assert.assertEquals(confirmationMsg,"User added Successfully" );
		}

}
