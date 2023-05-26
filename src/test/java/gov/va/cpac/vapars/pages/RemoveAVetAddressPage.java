package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveAVetAddressPage {
	
		@FindBy(xpath = "//*[@id='addressHistoryDiv']/div[2]/div/table/tbody/tr[1]/td[5]/a")
		public WebElement buttonRemoveVetAddress;
}