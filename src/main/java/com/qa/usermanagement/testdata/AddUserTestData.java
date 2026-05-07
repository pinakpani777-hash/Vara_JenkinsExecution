package com.qa.usermanagement.testdata;

import org.testng.annotations.DataProvider;

import com.qa.usermanagement.utilities.FakeDataGenerator;

public class AddUserTestData {

	
		
		FakeDataGenerator fdg1=new FakeDataGenerator();
		
		@DataProvider(name="generateData")
		public String[][] generateData() {
			String[][]data=new String[1][3];
			
			data[0][0]=fdg1.getFullName();
			data[0][1]=fdg1.getEmailAddress();
			data[0][2]=fdg1.getPhoneNumber();
			return data;
		}

	}

