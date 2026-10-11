package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	WebDriver driver;
	By signIn=By.xpath("(//span[text()='Sign in'])[2]");
	By username=By.xpath("//input[@name='login']");
	By password=By.name("password");
	By login=By.xpath("//input[@value='Sign in']");
	By dashboard=By.xpath("//span[text()='Dashboard']");
	//By createAccount=By.xpath("//a[text()='Create an account']");
	//By signUp=By.xpath("//span[text()='Sign up for GitHub']");
	By solutions=By.xpath("//button[text()='Solutions']");
	By CICD=By.xpath("//span[text()='CI/CD']");
	
	public loginPageObject(WebDriver driver1) {
		this.driver=driver1;
	}
	public WebElement clickOnSignIn() 
	{
		return driver.findElement(signIn);
	}
	public WebElement enterUserName() {
		return driver.findElement(username);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
	public WebElement displayDashboard() {
		return driver.findElement(dashboard);
	}
	public WebElement mouseHoverSolution() {
		return driver.findElement(solutions);
	}
	public WebElement clickOnCICD() {
		return driver.findElement(CICD);
	}
	
	
	
	
	
	
	
	
	
}
