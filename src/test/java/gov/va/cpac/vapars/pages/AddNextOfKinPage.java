package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNextOfKinPage {
	
	@FindBy(id = "nextOfKin-tab")
	public WebElement tabNextKin;
	
	@FindBy(id = "addNoKButton")
	public WebElement buttonNewKin;
	
	@FindBy(id = "PatientNextOfKinDataModel_LastName")
	public WebElement fieldKinLastName;
	
	@FindBy(id = "PatientNextOfKinDataModel_FirstName")
	public WebElement fieldKinFirstName;
	
	@FindBy(id = "PatientNextOfKinDataModel_AddressOne")
	public WebElement fieldKinAddress;
	
	@FindBy(id = "nokPostalCodeSearch")
	public WebElement fieldKinPC;
	
	@FindBy(xpath = "//*[@id='nextOfKinForm']/div[5]/div/fieldset/div/div/button")
	public WebElement buttonKinPCSearch;
	
	@FindBy(xpath = "//*[@id='postalResultsDiv']/table/tbody/tr/td[3]/button")
	public WebElement buttonKinPCSelect;
	
	@FindBy(id = "verifyNokButton")
	public WebElement buttonSaveKin;
	
	@FindBy(id = "closeNokButton")
	public WebElement buttonCloseKin;
}