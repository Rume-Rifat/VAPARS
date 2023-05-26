package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarkAVetAsDeceasedPage {

	@FindBy(xpath = "//*[@id='newPatientForm']/div[3]/div/div/div/fieldset/p/div/button[2]")
	public WebElement buttonPayeeNextOfKin;
}