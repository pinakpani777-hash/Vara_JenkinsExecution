package com.qa.usermanagement.utilities;

import com.github.javafaker.Faker;

public class FakeDataGenerator {
	
	static Faker fakeData=new Faker();
	
	public String getUserName() {
	return	fakeData.name().username();
	
	}
	public String getFullName() {
		return	fakeData.name().fullName();
		
		}
	public String getEmailAddress() {
		return	fakeData.internet().emailAddress();
		
		}
	public String getPassword() {
		return	fakeData.internet().password(6, 9, true, true, true);
		
		}
	
	public String getConfirmPassword() {
		return	fakeData.internet().password(6, 9, true, true, true);
		
		}
	
    public String getPhoneNumber() {
    	return fakeData.phoneNumber().phoneNumber();
    }
    
    public String getFirstName() {
    	return fakeData.name().firstName();
    }
    
    public String getLastName() {
    	return fakeData.name().lastName();
    }
	
}
