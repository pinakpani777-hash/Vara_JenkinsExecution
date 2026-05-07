package com.qa.usermanagement.base;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.usermanagement.browsefactory.BrowserManager;
import com.qa.usermanagement.pagelayers.AddUserPage;
import com.qa.usermanagement.pagelayers.LoginPage;
import com.qa.usermanagement.pagelayers.RegisterPage;
import com.qa.usermanagement.pagelayers.RegistrationPage;
import com.qa.usermanagement.utilities.BrowserActions;
import com.qa.usermanagement.utilities.CaptureScreenshot;
import com.qa.usermanagement.utilities.ReadConfigFile;
//@Listeners(ChainTestListener.class)

public class BaseTest {
	
	 WebDriver driver;
	BrowserActions driverActions;
	protected LoginPage loginPg;
	protected RegistrationPage registrationPg;
	protected AddUserPage addPg;
	protected RegisterPage registerPg;
	protected Logger log;

	public BaseTest() {
		log=LogManager.getLogger(this.getClass());

	}
   //   public static final Logger Logger =LogManager.getLogger(BaseTest.class);
	
	@Parameters({"browserName","browserHeadLess","browserPrivate"})
	@BeforeClass	
	public LoginPage launchApplication(String browserName1,String browserHeadless1,String browserPrivate1 ) {
		BrowserManager driverManager=new BrowserManager();
		ReadConfigFile configFile=new ReadConfigFile();
		configFile.setProperty("browserName", browserName1);
		configFile.setProperty("browserHeadLess", browserHeadless1);
		configFile.setProperty("browserPrivate", browserPrivate1);
		String browserName=configFile.getProperty("browserName");
		String browserHeadless=configFile.getProperty("browserHeadLess");
		String browserPrivate=configFile.getProperty("browserPrivate");
		boolean headlessValue=Boolean.parseBoolean(browserHeadless);
		boolean privateValue=Boolean.parseBoolean(browserPrivate);
		driver=driverManager.initDriver(browserName, headlessValue, privateValue);
		log.info("Browser has been launched with parameters"+"\t"+browserName+"\t"+headlessValue+"\t"+privateValue);
        driverActions=new BrowserActions(driver);
        String url= configFile.getProperty("testUrl");
		driverActions.enterUrl(url);
		log.info("Browser has been entered with the url"+"\t"+url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 loginPg=new LoginPage(driver);
	     registerPg= new RegisterPage(driver);
		 return loginPg;
	
	}

	

	@AfterMethod
	public void attachScreenshot(ITestResult result) {
		if(!result.isSuccess()) {
			Reporter.log("The Screenshot is captured for the failed test \t" +result.getName(),true);
			ChainTestListener.embed(CaptureScreenshot.getScreenshotFile(driver), "image/png");
			log.info("The screenshot is captured for the failure testcase"+"\t"+result.getName());
		}
	}
	
	
	@AfterClass
	public void tearDownBrowser() {
		if(!(driver==null)) {
			Reporter.log("Terminationg browser after all test classes executed",true);
			driverActions.terminateBrowser();
			log.info("Browser is terminated");
		}
	}
}

