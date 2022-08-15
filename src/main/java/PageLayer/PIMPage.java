package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.ActionClassMethods;
import UtilsLayer.HandleDropDown;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//b[text()='PIM']")
	private WebElement pimLink;

	@FindBy(id = "menu_pim_addEmployee")
	private WebElement addEmployee;

	@FindBy(name = "firstName")
	private WebElement firstname;

	@FindBy(name = "middleName")
	private WebElement middlename;

	@FindBy(name = "lastName")
	private WebElement lastname;

	@FindBy(name = "employeeId")
	private WebElement employeeId;

	@FindBy(id = "btnSave")
	private WebElement saveOrEditButton;

	@FindBy(id = "personal_cmbNation")
	private WebElement nationality;

	@FindBy(id = "personal_cmbMarital")
	private WebElement maritalStatus;

	@FindBy(name = "personal[txtLicenNo]")
	private WebElement personalLicenNo;

	@FindBy(name = "personal[txtNICNo]")
	private WebElement ssnNumber;

	@FindBy(id = "personal_txtLicExpDate")
	private WebElement licenseExpdate;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	private WebElement yearLicenseExpdate;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	private WebElement monthLicenseExpdate;

	@FindBy(xpath = "//a[text()='10']")
	private WebElement dateLicenseExpdate;

	@FindBy(id = "personal_DOB")
	private WebElement dob;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	private WebElement dobYear;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	private WebElement dobMonth;

	@FindBy(xpath = "//a[text()='10']")
	private WebElement dobdate;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public String addNewEmployeeInPIMPage(String fname, String mname, String lname) {
		ActionClassMethods.mouseOverAndClickOnElement(pimLink, addEmployee);
		firstname.sendKeys(fname);
		middlename.sendKeys(mname);
		lastname.sendKeys(lname);
		String empid = employeeId.getAttribute("value");
		saveOrEditButton.click();
		return empid;
	}

	public void clickOnEditbuttonPersonalDetailsInPIMPage() {
		saveOrEditButton.click();
	}

	public void enterDataInLicenN(String licenNo) {
		personalLicenNo.sendKeys(licenNo);
	}

	public void enterDataInSsNNumber(String ssnno) {
		ssnNumber.sendKeys(ssnno);
	}

	public void clickOnLicenseExpdate() {
		licenseExpdate.click();
	}

	public String selectlicenseExpYear(String year) {
		HandleDropDown.handleDPByVisibleText(yearLicenseExpdate, year);
		return HandleDropDown.checkSelectedValueFromDP(yearLicenseExpdate);
	}

	public String selectlicenseExpMonth(String month) {
		HandleDropDown.handleDPByVisibleText(monthLicenseExpdate, month);
		return HandleDropDown.checkSelectedValueFromDP(monthLicenseExpdate);
	}

	public void selectLicenseExpDate() {
		dateLicenseExpdate.click();
	}

	public void clickOnDob() {
		dob.click();
	}

	public String selectDobyear(String year) {
		HandleDropDown.handleDPByVisibleText(dobYear, year);
		return HandleDropDown.checkSelectedValueFromDP(dobYear);
	}

	public String selectDobmonth(String month) {
		HandleDropDown.handleDPByVisibleText(dobMonth, month);
		return HandleDropDown.checkSelectedValueFromDP(dobMonth);
	}

	public void clickOnDobDate() {
		dobdate.click();
	}

	public String handleCountryDropDown(String Nationalityname) {
		HandleDropDown.handleDPByVisibleText(nationality, Nationalityname);
		return HandleDropDown.checkSelectedValueFromDP(nationality);
	}

	public String handleMaritalstatusInPIMPage(String marital) {
		HandleDropDown.handleDPByVisibleText(maritalStatus, marital);
		return HandleDropDown.checkSelectedValueFromDP(maritalStatus);
	}

}
