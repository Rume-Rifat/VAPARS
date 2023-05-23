package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import gov.va.him.webapp.BasePage;

public class SearchForAVeteranPage extends BasePage {

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/nav/div[3]/ul/li[4]/a")
	public WebElement tabVeteran;
	
	@FindBy(xpath = "//*[@id='SSNSearchModel_SearchText']")
	public WebElement VetLookup;
	
	@FindBy(id = "ssnSearchSubmitButton")
	public WebElement VetSSNsearch;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div/div[2]/table/tbody/tr/td[3]/a")
	public WebElement VetSelect;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div/div[3]/button")
	public WebElement VetSelectClose; 
	
}