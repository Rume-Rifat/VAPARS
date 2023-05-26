package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import gov.va.him.webapp.BasePage;

public class SearchForAVeteranPage extends BasePage {

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/nav/div[3]/ul/li[4]/a")
	public WebElement tabVeteran;
	
	@FindBy(id = "SSNSearchModel_SearchText")
	public WebElement fieldVetLookup;
	
	@FindBy(id = "ssnSearchSubmitButton")
	public WebElement buttonVetSSNsearch;
	
	@FindBy(xpath = "//*[@id='ssnResultsDiv']/table/tbody/tr/td[3]/a")
	public WebElement buttonVetSelect;
	
	@FindBy(xpath = "//*[@id='ssnSearchResultsModal']/div/div/div[3]/button")
	public WebElement buttonVetSelectClose; 
}