package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.loginPageObject;
import resources.BaseClass;

public class VerifyLoginPage extends BaseClass {
	@Test
	public void verifyLogin() throws IOException {
		initialization();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		loginPageObject lp=new loginPageObject(driver);
		lp.clickOnSignIn().click();
		lp.enterUserName().sendKeys("appachavare@gmail.com");
		lp.enterPassword().sendKeys("Tanishka12!@");
		lp.clickOnLogin().click();
		Assert.assertTrue(lp.displayDashboard().isDisplayed());
	
	}


}
 