package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class AddOnListPage extends BasePage{
	
	//locators
	By btnNewAddOn = By.xpath("//a[text()='ADD NEW']");
	
	
	//constructor
	public AddOnListPage(WebDriver driver) {
		super(driver);
	}
		
		
	//methods
	public void clickNewAddOnButton() {
		getElement(btnNewAddOn).click();
	}

}
