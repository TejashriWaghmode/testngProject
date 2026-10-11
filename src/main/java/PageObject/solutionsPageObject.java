package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class solutionsPageObject {
	WebDriver driver;
	By contactSales=By.xpath("(//span[text()='Contact sales'])[1]");
	By firstName=By.xpath("//input[@name='first_name']");
	By lastName=By.xpath("//input[@name='last_name']");
	By company=By.xpath("//input[@name='company']");
	By jobTitle=By.xpath("//input[@name='job_title']");
	By email=By.xpath("//input[@name='email']");
	By noOfDevelopers=By.xpath("//select[@name='number_of_developers']");
	By checkbox=By.xpath("//input[starts-with(@id,'checkbox-product_interest')]/parent::span");
	
	public solutionsPageObject(WebDriver driver1) 
	{
		this.driver=driver1;
	}
	public WebElement clickOnContactSale () {
		return driver.findElement(contactSales);
	}
	public WebElement enterFirstName () {
		return driver.findElement(firstName);
	}
	public WebElement enterLastName () {
		return driver.findElement(lastName);
	}
	public WebElement enterCompanyName () {
		return driver.findElement(company);
	}
	public WebElement enterJobTitle() {
		return driver.findElement(jobTitle);
	}
	public WebElement enterEmail () {
		return driver.findElement(email);
	}
	public WebElement selectDeveloper() {
		return driver.findElement(noOfDevelopers);
	}
	public List<WebElement> selectCheckbox() {
		return driver.findElements(checkbox);
	}
	
	
	
	
	
	

}
