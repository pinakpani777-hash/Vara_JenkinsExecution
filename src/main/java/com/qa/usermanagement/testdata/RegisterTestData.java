package com.qa.usermanagement.testdata;

import org.testng.annotations.DataProvider;

import com.qa.usermanagement.utilities.FakeDataGenerator;

public class RegisterTestData {
	
FakeDataGenerator fdg2=new FakeDataGenerator();
	
	@DataProvider(name="generateData")
	public Object[][] generateData() {
		Object[][]data=new String[1][5];
		data[0][0]=fdg2.getFirstName();
		data[0][1]=fdg2.getLastName();
		data[0][2]=fdg2.getEmailAddress();
		data[0][3]=fdg2.getPassword();
		data[0][4]=fdg2.getConfirmPassword();
		return data;
	}


}
