package gov.va.cpac.VAPARS.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditAVeteransNamePage {

	WebDriver driver;

	public EditAVeteransNamePage(WebDriver driver) {
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

	By editVetDetails = By.id("editDetailsButton");
	public void clickEditVetDetails() {
		driver.findElement(editVetDetails).click();
	}
	
	By editFieldLastName = By.xpath("//*[@id='PatientDataModel_LastName']");
	public void inputEditLastName(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='PatientDataModel_LastName']")));
		driver.findElement(editFieldLastName).clear();
		driver.findElement(editFieldLastName).sendKeys(string);
	}

	By editFieldFirstName = By.xpath("//*[@id='PatientDataModel_FirstName']");
	public void inputEditFirstName(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='PatientDataModel_FirstName']")));
		driver.findElement(editFieldFirstName).clear();
		driver.findElement(editFieldFirstName).sendKeys(string);
	}
	
	By buttonCloseAddress = By.xpath("//*[@id='savePatientButton']");
	public void clickCloseAddress() {
		driver.findElement(buttonCloseAddress).click();
	}
}