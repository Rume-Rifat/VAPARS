package gov.va.cpac.VAPARS.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditAVeteranAddressPage {

	WebDriver driver;

	public EditAVeteranAddressPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By tabVeteran = By.xpath("/html/body/div[1]/div[1]/div/nav/div[3]/ul/li[4]/a");
	public void clickTabVeteran() {
		driver.findElement(tabVeteran).click();
	}
	
	By VetLookup = By.xpath("//*[@id='SSNSearchModel_SearchText']");
	public void lookupVeteran(String string) {
		driver.findElement(VetLookup).sendKeys(string);
	}
	
	By VetSSNsearch = By.id("ssnSearchSubmitButton");
	public void SSNsearchVet() {
		driver.findElement(VetSSNsearch).click();
	}
	
	By VetSelect = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div/div[2]/table/tbody/tr/td[3]/a");
	public void SelectVetSSNsearch () {
     	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div/div[2]/table/tbody/tr/td[3]/a")));
		driver.findElement(VetSelect).click();
	}
	
	By VetSelectClose = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div/div[3]/button");
	public void CloseVetSSNsearch () {
     	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div/div[3]/button")));
		driver.findElement(VetSelectClose).click();
	}
	
	By VetAddressHistory = By.id("address-history-tab");
	public void ClickAddressHistory() {
		driver.findElement(VetAddressHistory).click();
	}
	
	By EditAddress = By.xpath("//*[@id='addressHistoryDiv']/div[2]/div/table/tbody/tr/td[3]/button");
	public void ClickEditAddress() {
		driver.findElement(EditAddress).click();
	}
	
	By editFieldAddress = By.id("PatientAddressDataModel_AddressOne");
	public void inputEditAddress(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PatientAddressDataModel_AddressOne")));
		driver.findElement(editFieldAddress).clear();
		driver.findElement(editFieldAddress).sendKeys(string);
	}
	
	By fieldPostalCode = By.id("postalCodeSearch");
	public void inputPostalCode(String string) {
		driver.findElement(fieldPostalCode).sendKeys(string);
	}
	
	By buttonSearch = By.xpath("//*[@id='patientAddressForm']/div[4]/div/div/div/button");
	public void clickbuttonSearch() {
		driver.findElement(buttonSearch).click();
	}
	
	By buttonEditPC = By.xpath("//*[@id='postalResultsDiv']/table/tbody/tr/td[3]/button");
	public void clickEditPC() {
		driver.findElement(buttonEditPC).click();
	}

	By buttonSaveAddress = By.id("patientAddressSubmitButton");
	public void clickSaveAddress() {
		driver.findElement(buttonSaveAddress).click();
	}
	
	By buttonCloseAddress = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[9]/button");
	public void clickCloseAddress() {
		driver.findElement(buttonCloseAddress).click();
	}
	
	By buttonCloseEditAddress = By.xpath("//*[@id='patientAddressForm']/div[9]/button");
	public void clickCloseEditAddress() {
		driver.findElement(buttonCloseEditAddress).click();
	}

}

