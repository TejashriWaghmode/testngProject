package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.loginPageObject;
import PageObject.solutionsPageObject;
import resources.BaseClass;

public class verifySolutionsPage extends BaseClass {
	@Test
	public void signUpPage() throws IOException, InterruptedException {
	initialization();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	loginPageObject lp=new loginPageObject(driver);
	Actions act=new Actions(driver);
	act.moveToElement(lp.mouseHoverSolution()).build().perform();
	lp.clickOnCICD().click();
	solutionsPageObject sp=new solutionsPageObject(driver);
	sp.clickOnContactSale().click();
	Thread.sleep(3000);
	sp.enterFirstName().sendKeys("Tejashri");
	sp.enterLastName().sendKeys("Chavare");
	sp.enterCompanyName().sendKeys("Wipro");
	sp.enterJobTitle().sendKeys("Developer");
	sp.enterEmail().sendKeys("tejashriwaghmode@gmail.com");
	
	Select s=new Select(sp.selectDeveloper());
	s.selectByIndex(2);
	for(WebElement checkbox:sp.selectCheckbox()) {	    
		checkbox.click();
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
