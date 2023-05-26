package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveNextToKinPage {
	
	@FindBy(xpath = "//*[@id='nokDiv']/div[3]/div/table/tbody/tr/td[5]/a/i")
	public WebElement removeNextKin;
}