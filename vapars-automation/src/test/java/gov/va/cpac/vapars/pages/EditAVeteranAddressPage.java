package gov.va.cpac.VAPARS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import gov.va.him.webapp.BasePage;

public class EditAVeteranAddressPage extends BasePage {

	@FindBy(id = "address-history-tab")
	public WebElement vetAddressHistory;
	
	@FindBy(xpath = "//*[@id='addressHistoryDiv']/div[2]/div/table/tbody/tr/td[3]/button")
	public WebElement editAddress;
	
	@FindBy(id = "PatientAddressDataModel_AddressOne")
	public WebElement editFieldAddress;
	
	@FindBy(id = "postalCodeSearch")
	public WebElement fieldPostalCode;
	
	@FindBy(xpath = "//*[@id='patientAddressForm']/div[4]/div/div/div/button")
	public WebElement buttonSearch;
		
	@FindBy(xpath = "//*[@id='postalResultsDiv']/table/tbody/tr/td[3]/button")
	public WebElement buttonEditPC;

	@FindBy(id = "patientAddressSubmitButton")
	public WebElement buttonSaveAddress;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[9]/button")
	public WebElement buttonCloseAddress;
	
	@FindBy(xpath = "//*[@id='patientAddressForm']/div[9]/button")
	public WebElement buttonCloseEditAddress;

}

