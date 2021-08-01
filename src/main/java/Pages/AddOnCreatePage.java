package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.BasePage;

public class AddOnCreatePage extends BasePage{
	
	//locators
	By lblTitle = By.tagName("h5");
	
	//constructor
		public AddOnCreatePage(WebDriver driver) {
			super(driver);
		}
		
	//methods
	public void validateCreateForm() {
		
	 String actualTitle = getElement(lblTitle).getText();
	 String expectedTitle = "Create AddOn";
	 Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle), "Title validation failed. Expected: " + expectedTitle + " and Actual:  "+ actualTitle);;
	}

}
