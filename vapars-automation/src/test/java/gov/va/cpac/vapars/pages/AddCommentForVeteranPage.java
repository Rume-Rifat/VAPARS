package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCommentForVeteranPage {

	@FindBy(xpath = "//*[@id='newPatientForm']/div[1]/div/div[3]/button[1]")
	public WebElement buttonCommentVet;
	
	@FindBy(id = "PatientLogDataModel_Comment")
	public WebElement fieldCommentVet;
	
	@FindBy(xpath = "//*[@id='newPatientLog']/div[2]/button[1]")
	public WebElement buttonSaveComments;
	
	@FindBy(xpath = "//*[@id='newPatientLog']/div[2]/button[2]")
	public WebElement buttonCloseComments;

}
