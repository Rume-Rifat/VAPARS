package gov.va.cpac.VAPARS.Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAVeteranPage {
	WebDriver driver;

	public CreateAVeteranPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By tabVeteran = By.xpath("/html/body/div[1]/div[1]/div/nav/div[3]/ul/li[4]/a");
	public void clickTabVeteran() {
		driver.findElement(tabVeteran).click();
	}
	
	By buttonNewVeteran = By.xpath("//div[@id='main-wrapper']/div[8]/div/div/div[1]/button");
	public void clickButtonNewVeteran() {
		driver.findElement(buttonNewVeteran).click();	
	}

	By fieldSSN = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[8]/div/div/div[3]/div/div[1]/div/form/div[3]/div/div[1]/input");
	public void inputSSN(String string) {
		driver.findElement(fieldSSN).sendKeys(string);
	}

	By fieldICN = By.id("PatientDataModel_IntegrationControlNumber");
	public void inputICN(String string) {
		driver.findElement(fieldICN).sendKeys(string);	
	}
	
	By fieldLastName = By.id("PatientDataModel_LastName");
	public void inputLastName(String string) {
		driver.findElement(fieldLastName).sendKeys(string);
	}

	By fieldFirstName = By.id("PatientDataModel_FirstName");
	public void inputFirstName(String string) {
		driver.findElement(fieldFirstName).sendKeys(string);
	}

	By buttonSavePatient = By.xpath("//*[@id='savePatientButton']");
	public void clickSavePatient() throws InterruptedException {
        for(int i=0; i<5; i++){
			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
		}
     	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='savePatientButton']")));
    	driver.findElement(buttonSavePatient).click();    
    	Thread.sleep(5000);
    	driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
	}

	By buttonNewAddress = By.id("newAddressButton");
	public void clickNewAddress() {
		driver.findElement(buttonNewAddress).click();
	}

	By fieldAddress = By.id("PatientAddressDataModel_AddressOne");
	public void inputAddress(String string) {
		driver.findElement(fieldAddress).sendKeys(string);
	}

	By fieldPostalCode = By.id("postalCodeSearch");
	public void inputPostalCode(String string) {
		driver.findElement(fieldPostalCode).sendKeys(string);
	}

	By buttonSearch = By.xpath("//*[@id='patientAddressForm']/div[4]/div/div/div/button");
	public void clickbuttonSearch() {
		driver.findElement(buttonSearch).click();
	}
	
	By buttonSelectPC = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[5]/div/div/table/tbody/tr/td[3]/button");
	public void clickSelectPC() {
		driver.findElement(buttonSelectPC).click();
	}

	By buttonSaveAddress = By.id("patientAddressSubmitButton");
	public void clickSaveAddress() {
		driver.findElement(buttonSaveAddress).click();
	}
	
	By buttonCloseAddress = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[9]/button");
	public void clickCloseAddress() {
		driver.findElement(buttonCloseAddress).click();
	}
	
}