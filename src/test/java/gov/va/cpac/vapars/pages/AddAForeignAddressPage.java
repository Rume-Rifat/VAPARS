package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAForeignAddressPage {
	
	@FindBy(xpath = "//*[@id='patientAddressFormDiv']/div[1]/button[2]")
	public WebElement buttonForeignAddress;
	
	@FindBy(id = "PatientAddressDataModel_AddressOne")
	public WebElement fieldForeignAddress;
	
	@FindBy(id = "PatientAddressDataModel_City")	
	public WebElement fieldForeignCity;
			
	@FindBy(id = "PatientAddressDataModel_State")	
	public WebElement fieldForeignState; 
	
	@FindBy(id = "PatientAddressDataModel_PostalCode")
	public WebElement fieldPostalCode;
		
	@FindBy(id = "PatientAddressDataModel_CountryId")
	public WebElement dropDownCountry;
		
	@FindBy(id = "patientAddressSubmitButton")
	public WebElement buttonSaveForeignAddress; 
			
	@FindBy(id = "//*[@id='patientAddressForm']/div[8]/button[2]")
	public WebElement buttonCloseForeignAddress;	
}