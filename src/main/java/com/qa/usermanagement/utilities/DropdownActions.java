package com.qa.usermanagement.utilities;

	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import com.qa.usermanagement.exceptions.ElementExceptions;
	import com.qa.usermanagement.validation.valuesValidation;

	public class DropdownActions extends BaseUtility {
		
	    public DropdownActions(WebDriver driver) {
	        super(driver);
	    }
    
	    private Select getSelect(By locator) {
	        valuesValidation.validateLocator("getSelect", locator);
	        return new Select(fluentWait.waitForVisibility(locator));
	    }

	    public void selectByValue(By locator, String value) {
	        valuesValidation.validateStringInput("selectByValue", value);

	        try {
	            getSelect(locator).selectByValue(value);
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in selectByValue: Unable to select value '" + value + "'"
	            );
	        }
	    }

	    public void selectByVisibleText(By locator, String text) {
	        valuesValidation.validateStringInput("selectByVisibleText", text);

	        try {
	            getSelect(locator).selectByVisibleText(text);
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in selectByVisibleText: Unable to select text '" + text + "'"
	            );
	        }
	    }

	    public void selectByIndex(By locator, int index) {
	        try {
	            getSelect(locator).selectByIndex(index);
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in selectByIndex: Unable to select index '" + index + "'"
	            );
	        }
	    }

	    public void selectByContainsVisibleText(By locator, String partialText) {
	        valuesValidation.validateStringInput("selectByContainsVisibleText", partialText);

	        try {
	            getSelect(locator).selectByContainsVisibleText(partialText);
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in selectByContainsVisibleText: Unable to select text '" + partialText + "'"
	            );
	        }
	    }

	    
	    public List<String> getOptions(By locator) {

	        valuesValidation.validateLocator("getOptions", locator);

	        try {
	            List<String> optionsList = new ArrayList<>();

	            for (WebElement option : getSelect(locator).getOptions()) {
	                optionsList.add(option.getText());
	            }

	            return optionsList;

	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in getOptions: Unable to fetch dropdown options for locator: " + locator
	            );
	        }
	    }
	    
	    public String getFirstSelectedOption(By locator) {
	        try {
	            return getSelect(locator).getFirstSelectedOption().getText();
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in getFirstSelectedOption: Unable to fetch selected option"
	            );
	        }
	    }

	    public List<String> getAllSelectedOptions(By locator) {
	        try {
	            List<String> list = new ArrayList<>();

	            for (WebElement e : getSelect(locator).getAllSelectedOptions()) {
	                list.add(e.getText());
	            }

	            return list;
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in getAllSelectedOptions: Unable to fetch options"
	            );
	        }
	    }

	   

	    private void validateMultiSelect(By locator) {
	        if (!getSelect(locator).isMultiple()) {
	            throw new ElementExceptions("ERROR: Dropdown is not multi-select");
	        }
	    }

	    public void deselectByValue(By locator, String value) {
	        valuesValidation.validateStringInput("deselectByValue", value);

	        try {
	            validateMultiSelect(locator);
	            getSelect(locator).deselectByValue(value);
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in deselectByValue: Unable to deselect value '" + value + "'"
	            );
	        }
	    }

	    public void deselectByIndex(By locator, int index) {
	        try {
	            validateMultiSelect(locator);
	            getSelect(locator).deselectByIndex(index);
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in deselectByIndex: Unable to deselect index '" + index + "'"
	            );
	        }
	    }

	    public void deselectByVisibleText(By locator, String text) {
	        valuesValidation.validateStringInput("deselectByVisibleText", text);

	        try {
	            validateMultiSelect(locator);
	            getSelect(locator).deselectByVisibleText(text);
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in deselectByVisibleText: Unable to deselect text '" + text + "'"
	            );
	        }
	    }

	    public void deselectAll(By locator) {
	        try {
	            validateMultiSelect(locator);
	            getSelect(locator).deselectAll();
	        } catch (Exception e) {
	            throw new ElementExceptions(
	                "ERROR in deselectAll: Unable to clear selections"
	            );
	        }
	    }
	}

	

