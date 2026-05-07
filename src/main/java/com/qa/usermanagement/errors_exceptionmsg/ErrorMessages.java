package com.qa.usermanagement.errors_exceptionmsg;

public class ErrorMessages {
	
	public final static String invalidBrowserMsg="You have passed invalid browserName\t";
	public final static String passedBrowserName="The passed browser name is\t";
	public final static String invalidBrowserException="===[BrowserManager-initDriver] It supports only chrome/firefox/edge===";
	public final static String validateMethodNameException="===[ValuesValidation-validateLocator]The method name cannot be null===";
  
	public final static String doClickException="===[ElementActions-doClick] Element is not clickable===";
	public final static String enterValuesException="===[ElementActions-enterValues] Values are not entered===";
	public final static String clearValuesException="===[ElementActions-clearValues] Values are not cleared===";
	public final static String checkElementDisplayedException="===[ElementActions-checkElementDisplayed] Element is not displayed===";
	public final static String checkElementEnabledException="===[ElementActions-checkElementEnabled] Element is not enabled===";
	public final static String checkElementSelectedException="===[ElementActions-checkElementSelected] Element is not selected===";
	public final static String fetchElementTextException="===[ElementActions-fetchElementText] Element text is not fetched===";
    public final static String dropdownSelectException="===[DropdownActions-selectByVisibleText] Element text is not visible===";
    public final static String dropdownFetchException="===[DropdownActions-getSelectedOption] Failed to fetch selected value from dropdown===";
}
