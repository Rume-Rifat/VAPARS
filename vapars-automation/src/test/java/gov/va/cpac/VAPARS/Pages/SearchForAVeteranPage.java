package gov.va.cpac.VAPARS.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchForAVeteranPage {
	WebDriver driver;

	public SearchForAVeteranPage(WebDriver driver) {
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
	
}