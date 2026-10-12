package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.loginPageObject;
import resources.BaseClass;

public class VerifyLoginPage extends BaseClass {
	@Test(dataProvider="loginData")
	
	public void verifyLogin( String username,String password) throws IOException {
		initialization();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		loginPageObject lp=new loginPageObject(driver);
		lp.clickOnSignIn().click();
		lp.enterUserName().sendKeys(username);
		lp.enterPassword().sendKeys(password);
		lp.clickOnLogin().click();
		Assert.assertTrue(lp.displayDashboard().isDisplayed());
	
	}
	
	@DataProvider(name ="loginData")
	public Object[][] test(){
		Object[][] data= new Object[2][2];
		data[0][0]="appachavare@gmail.com";
		data[0][1]="Tanishka12!@";
		data[1][0]="Tejashriwaghmode@gmail.com";
		data[1][1]="Anu12!@";
		return data;
	}
	

}
 