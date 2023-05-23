package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import gov.va.him.webapp.BasePage;

public class CreateAVeteranPage extends BasePage {
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/nav/div[3]/ul/li[4]/a")
	public WebElement tabVeteran;
	
	@FindBy(xpath = "//div[@id='main-wrapper']/div[8]/div/div/div[1]/button")
	public WebElement buttonNewVeteran;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[8]/div/div/div[3]/div/div[1]/div/form/div[3]/div/div[1]/input")
	public WebElement fieldSSN;
	
	@FindBy(id = "PatientDataModel_IntegrationControlNumber")
	public WebElement fieldICN;

	@FindBy(id = "PatientDataModel_LastName")
	public WebElement fieldLastName;

	@FindBy(id = "PatientDataModel_FirstName")
	public WebElement fieldFirstName;

	@FindBy(xpath = "//*[@id='savePatientButton']")
	public WebElement buttonSavePatient;

	@FindBy(id = "newAddressButton")
	public WebElement buttonNewAddress;

	@FindBy(id = "PatientAddressDataModel_AddressOne")
	public WebElement fieldAddress;

	@FindBy(id = "postalCodeSearch")
	public WebElement fieldPostalCode;

	@FindBy(xpath = "//*[@id='patientAddressForm']/div[4]/div/div/div/button")
	public WebElement buttonSearch;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[5]/div/div/table/tbody/tr/td[3]/button")
	public WebElement buttonSelectPC;

	@FindBy(id = "patientAddressSubmitButton")
	public WebElement buttonSaveAddress;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[9]/button")
	public WebElement buttonCloseAddress;
	
}