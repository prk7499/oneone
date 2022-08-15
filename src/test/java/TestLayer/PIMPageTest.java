package TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import UtilsLayer.ExcelReader;

@Test(groups = { "PIMPage" }, dependsOnGroups = { "HomePage" })
public class PIMPageTest extends BaseClass {
	protected PIMPage pimpage;
	protected String empid;

	@Test(priority = 1, dataProvider = "testData")
	public void validatePIMNewEmployee(String fname, String mname, String lname) {
		pimpage = new PIMPage();
		empid = pimpage.addNewEmployeeInPIMPage(fname, mname, lname);
	}

	@DataProvider(name = "testData")
	public Object[][] getData() {
		ExcelReader excel = new ExcelReader(
				System.getProperty("user.dir") + "\\src\\main\\java\\TestDataLayer\\TestData.xlsx");

		int rows = excel.countTotalRows(2);
		int cells = excel.countTotalcells(2);

		Object[][] data = new Object[rows][cells];

		for (int i = 0; i < rows; i++) {
			data[i][0] = excel.getDataFromExcelSheet(2, i, 0);
			data[i][1] = excel.getDataFromExcelSheet(2, i, 1);
			data[i][2] = excel.getDataFromExcelSheet(2, i, 2);

		}

		return data;
	}

	@Test(priority = 2)
	public void validatePersonalDetailsInPIMPage() {
		pimpage.clickOnEditbuttonPersonalDetailsInPIMPage();
		pimpage.enterDataInLicenN("123456778");
		pimpage.enterDataInSsNNumber("9999999999");

	}

	@Test(priority = 3)
	public void validateDrivingLicenseDate() {
		pimpage.clickOnLicenseExpdate();
		String selectYear = pimpage.selectlicenseExpYear("2023");
		Assert.assertEquals(selectYear, "2023");

		String selectmonth = pimpage.selectlicenseExpMonth("Nov");
		Assert.assertEquals(selectmonth, "Nov");

		pimpage.selectLicenseExpDate();

	}

	@Test(priority = 4)
	public void validateCountryDropDown() {
		String actualSelectedValue = pimpage.handleCountryDropDown("Indian");

		Assert.assertEquals(actualSelectedValue, "Indian");
	}

	@Test(priority = 5)
	public void validateMaritalStatusDropDown() {
		String actualSelectedValuemarital = pimpage.handleMaritalstatusInPIMPage("Single");

		Assert.assertEquals(actualSelectedValuemarital, "Single");
	}

	@Test(priority = 6)
	public void validateDobDates() {
		pimpage.clickOnDob();
		String year = pimpage.selectDobyear("2000");
		Assert.assertEquals(year, "2000");

		String month = pimpage.selectDobmonth("Dec");
		Assert.assertEquals(month, "Dec");

		pimpage.clickOnDobDate();

	}

}
