package com.qa.usermanagement.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDummy {
	@Test
	public void testGithub() {
		Reporter.log("The gitHub flow is being tested");
	}

	@Test
	public void testNgork() {
	 Reporter.log("Jenkins is running and ngork is connected to 8080 port");	
	}
	public void add() {
		Reporter.log("This is vara ,testing new changes",true);	}
}
