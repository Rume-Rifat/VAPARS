package gov.va.cpac.vapars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePrimaryNextOfKinPage {

	@FindBy(xpath = "//*[@id=\"nokDiv\"]/div[3]/div/table/tbody/tr/td[2]/button")
	public WebElement tabPrimaryKin;
}