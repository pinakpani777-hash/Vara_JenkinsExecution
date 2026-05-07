package com.qa.usermanagement.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
	
	int start=0;   
	int end=3;
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
		//	retrylogic
			
			if(start<end) {
				start++;
				result.setStatus(result.FAILURE);
				return true;
			}else {
				result.setStatus(result.FAILURE);
			}
		}else {
			result.setStatus(result.SUCCESS);
		}
		return false; //status is pass
	}
	
}
