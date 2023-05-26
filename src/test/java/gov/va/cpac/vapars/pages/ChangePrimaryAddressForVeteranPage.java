package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePrimaryAddressForVeteranPage {

	@FindBy(id = "address-history-tab")
	public WebElement tabVetAddressHistory;	
	
	@FindBy(xpath = "//*[@id='addressHistoryDiv']/div[2]/div/table/tbody/tr/td[2]/button")
	public WebElement buttonVetPrimaryAddress;
}