import base.BaseTest;
import org.testng.annotations.Test;

import Pages.AddOnCreatePage;
import Pages.AddOnListPage;
import Pages.LoginPage;

public class AddOnTests extends BaseTest {
	
	
	@Test
	public void ValidateCreateADDOnForm_JJA27() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.performUserLogin(excelTestData.get("UserID"), excelTestData.get("Password"));
		loginPage.selectMenuOption("Menu Management", "Add On");
		AddOnListPage addOnListPage = new AddOnListPage(driver);
		addOnListPage.clickNewAddOnButton();
		AddOnCreatePage addOnCreatePage = new AddOnCreatePage(driver);
		addOnCreatePage.validateCreateForm();
	}
	
	@Test
	public void ValidateCreateAddOnFormWithToppingsType() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.performUserLogin(excelTestData.get("UserID"), excelTestData.get("Password"));
		loginPage.selectMenuOption("Menu Management", "Add On");
		AddOnListPage addOnListPage = new AddOnListPage(driver);
		addOnListPage.clickNewAddOnButton();
		AddOnCreatePage addOnCreatePage = new AddOnCreatePage(driver);
		//addOnCreatePage.validateCreateForm();
	}
	
	

}
