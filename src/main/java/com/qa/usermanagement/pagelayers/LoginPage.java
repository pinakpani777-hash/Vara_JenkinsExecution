package com.qa.usermanagement.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import io.qameta.allure.Step;

public class LoginPage extends BasePage{

	final private By userNameTf = By.xpath("//input[@id='username']");
	final private By pwdTf = By.id("password");
	final private By loginBtn = By.xpath("//button[@id='button-login-submit']");
	final private By createAccLink = By.id("link-login-to-register");
	final private By addUserLink=By.id("nav-link-add-user");
	final private By loginFailure=By.xpath("//p[@id='login-error-message']");
	

	public  LoginPage(WebDriver driver) {
		super(driver);

	}
	
	@Step("checkUserNameElementDisplayed")
	public Boolean checkUserNameElementDisplayed() {
		
	return	elementActions.checkElementDisplayed("checkUserNameElementDisplayed",userNameTf );
	}
	
	@Step("checkPwdElementDisplayed")
	public Boolean checkPwdElementDisplayed() {
		
		return	elementActions.checkElementDisplayed("checkPwdElementDisplayed",pwdTf );
		}
	
	@Step("checkLoginBtnElementDisplayed")
     public Boolean checkLoginBtnElementDisplayed() {
		
		return	elementActions.checkElementDisplayed("checkLoginBtnElementDisplayed",loginBtn );
		}
		
	@Step("checkCreateAccLinkElementDisplayed")
	public Boolean checkCreateAccLinkElementDisplayed() {
		
		return	elementActions.checkElementDisplayed("checkCreateAccLinkElementDisplayed",createAccLink );
		}
		
	@Step("checkUserNameElementEnabled")
	public Boolean checkUserNameElementEnabled() {
		
		return	elementActions.checkElementEnabled("checkUserNameElementEnabled",userNameTf );
		}
		
	@Step("checkPwdElementEnabled")
		public Boolean checkPwdElementEnabled() {
			
			return	elementActions.checkElementEnabled("checkPwdElementEnabled",pwdTf );
			}
		
	@Step("checkLoginBtnElementEnabled")
		public Boolean checkLoginBtnElementEnabled() {
			
			return	elementActions.checkElementEnabled("checkLoginBtnElementEnabled",loginBtn );
			}
	
	@Step("checkCreateAccLinkElementEnabled")
			
		public Boolean checkCreateAccLinkElementEnabled() {
			
			return	elementActions.checkElementEnabled("checkCreateAccLinkElementEnabled",createAccLink );
			}


	
	

	/*public void checkElementsActive() {

 
		WebElement usnElement = driver.findElement(userNameTf);
		WebElement pwdTfElement = driver.findElement(pwdTf);
		WebElement loginBtnElement = driver.findElement(loginBtn);
		WebElement createAccLinkElement = driver.findElement(createAccLink);

		if (usnElement.isDisplayed()) {
			Reporter.log(usnElement + "\t is Displayed",true);
			if (usnElement.isEnabled()) {
				Reporter.log(usnElement + "\t is Enabled",true);

			}
			else {
				Reporter.log(usnElement + "\t is not Enabled",true);

			}
		}
		if (pwdTfElement.isDisplayed()) {
			Reporter.log(pwdTfElement + "\t is Displayed",true);
			if (pwdTfElement.isEnabled()) {
				Reporter.log(pwdTfElement + "\t is Enabled",true);

			}
			else {
				Reporter.log(pwdTfElement + "\t is not Enabled");

			}
		}
		if (loginBtnElement.isDisplayed()) {
			Reporter.log(loginBtnElement + "\t is Displayed",true);
			if (loginBtnElement.isEnabled()) {
				Reporter.log(loginBtnElement + "\t is Enabled",true);

			}
			else {
				Reporter.log(loginBtnElement + "\t is not Enabled",true);

			}
		}
		if (createAccLinkElement.isDisplayed()) {
			Reporter.log(createAccLinkElement + "\t is Displayed",true);
			if (createAccLinkElement.isEnabled()) {
				Reporter.log(createAccLinkElement + "\t is Enabled",true);

			}
			else {
				Reporter.log(createAccLinkElement + "\t is not Enabled",true);

			}
		}

	}*/
	
	
	public String doLogin(String usn,String pwd) {
		System.out.println(usn +"\t"+pwd);
	elementActions.enterValues(userNameTf,usn);
	elementActions.enterValues(pwdTf,pwd);
	elementActions.doClick(loginBtn);
	
	String textValue=elementActions.fetchElementText("doLogin", loginFailure);
	Reporter.log("The textValue of doLogin is :"+textValue,true);
	return textValue;

	}
		
	public RegistrationPage navigateToRegistrationPage() {
		elementActions.doClick(createAccLink);
	return	new RegistrationPage(driver);
		
	}
	
	public AddUserPage navigateToAddUserPage() {
		elementActions.doClick(addUserLink);
		return new AddUserPage(driver);
		}
}
