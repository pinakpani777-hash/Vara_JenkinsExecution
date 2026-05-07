package com.qa.usermanagement.browsefactory;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;

public class BrowserOptions {
	
	public static ChromeOptions chromeOptions(Boolean headLess,Boolean privateTab) {
		
		ChromeOptions chromeOpts=new ChromeOptions();
		if(headLess) {
			Reporter.log("Running chromeBrowser in headless mode",true);
			chromeOpts.addArguments("--headless");
		}
		if(privateTab) {
			Reporter.log("Running chromeBrowser in incognito mode",true);
			chromeOpts.addArguments("--incognito");
			
		}
		return chromeOpts;
		
	}
public static FirefoxOptions firefoxOptions(Boolean headLess,Boolean privateTab) {
		
	FirefoxOptions firefoxOpts=new FirefoxOptions();
		if(headLess) {
			Reporter.log("Running firefoxBrowser in headless mode",true);
			firefoxOpts.addArguments("--headless");
		}
		if(privateTab) {
			Reporter.log("Running firefoxBrowser in incognito mode",true);
			firefoxOpts.addArguments("--private");
			
		}
		return firefoxOpts;
		
	}

public static EdgeOptions edgeOptions(Boolean headLess,Boolean privateTab) {
	
	EdgeOptions edgeOpts=new EdgeOptions();
		if(headLess) {
			Reporter.log("Running EdgeBrowser in headless mode",true);
			edgeOpts.addArguments("--headless");
		}
		if(privateTab) {
			Reporter.log("Running EdgeBrowser in incognito mode",true);
			edgeOpts.addArguments("--inprivate");
			
		}
		return edgeOpts;
		
	}


}
