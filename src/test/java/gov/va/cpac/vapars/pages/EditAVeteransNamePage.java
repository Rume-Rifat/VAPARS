package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import gov.va.him.webapp.BasePage;

public class EditAVeteransNamePage extends BasePage {

	@FindBy(id = "editDetailsButton")
	public WebElement editVetDetails; 
	
	@FindBy(xpath = "//*[@id='PatientDataModel_LastName']")
	public WebElement editFieldLastName;

	@FindBy(xpath = "//*[@id='PatientDataModel_FirstName']")
	public WebElement editFieldFirstName;
	
	@FindBy(xpath = "//*[@id='savePatientButton']")
	public WebElement buttonCloseAddress; 
}