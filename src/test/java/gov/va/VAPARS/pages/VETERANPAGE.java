package gov.va.VAPARS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VETERANPAGE {
	
	WebDriver driver;
	
	public WebElement tabVeteran() {
		
	WebElement tabVeteran = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div[3]/ul/li[4]/a"));
	return tabVeteran;
	}

	@FindBy(xpath = "(//div[@id='main-wrapper']/div[8]/div/div/div[1]/button)")
	public WebElement buttonNewVeteran;

	@FindBy(id="PatientDataModel_SSN")
	public WebElement fieldSSN;

	@FindBy(id="PatientDataModel_IntegrationControlNumber")
	public WebElement fieldICN;
	
	@FindBy(id="PatientDataModel_LastName")
	public WebElement fieldLastName;

	@FindBy(id="PatientDataModel_FirstName")
	public WebElement fieldFirstName;

	@FindBy(id="savePatientButton")
	public WebElement buttonSavePatient;

	@FindBy(id="newAddressButton")
	public WebElement buttonAddress;

	@FindBy(id="PatientAddressDataModel_AddressOne")
	public WebElement fieldAddress;

	@FindBy(id="postalCodeSearch")
	public WebElement fieldPostalCode;

	@FindBy(xpath = "(//div[@id='patientAddressForm']/div[4]/div/div/div/button)")
	public WebElement buttonSearch;

	@FindBy(xpath = "(//div[@id='postalResultsDiv']/table/tbody/tr/td[3]/button)")
	public WebElement buttonSelectPC;

	@FindBy(id="patientAddressSubmitButton")
	public WebElement buttonSaveAddress;

}
