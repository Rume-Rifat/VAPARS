package gov.va.cpac.VAPARS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAForeignAddressPage {

	@FindBy(id = "newAddressButton")
	public WebElement buttonNewAddress; 
	
	@FindBy(xpath = "//*[@id='patientAddressFormDiv']/div[1]/button[2]")
	public WebElement buttonForeignAddress;
	
	@FindBy(xpath = "//*[@id='PatientAddressDataModel_AddressOne']")
	public WebElement fieldForeignAddress;
	
	@FindBy(xpath = "//*[@id='PatientAddressDataModel_City']")	
	public WebElement fieldForeignCity;
			
	@FindBy(xpath = "//*[@id='PatientAddressDataModel_State']")	
	public WebElement fieldForeignState; 
	
	@FindBy(xpath = "//*[@id='PatientAddressDataModel_PostalCode']")
	public WebElement selectPostalCode;
		
	@FindBy(xpath = "//*[@id='PatientAddressDataModel_CountryId']")
	public WebElement selectCountry;
		
	@FindBy(xpath = "//*[@id='patientAddressSubmitButton']")
	public WebElement saveForeignAddress; 
			
	@FindBy(xpath = "//*[@id='patientAddressForm']/div[8]/button[2]")
	public WebElement closeForeignAddress;
	
	}
