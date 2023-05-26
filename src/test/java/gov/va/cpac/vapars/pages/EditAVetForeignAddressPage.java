package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAVetForeignAddressPage {
	
	@FindBy(xpath = "//*[@id='addressHistoryDiv']/div[2]/div/table/tbody/tr[1]/td[3]/button")
	public WebElement buttonEditForeignAddress;
}