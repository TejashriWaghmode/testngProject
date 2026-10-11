package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initialization() throws IOException 
	{
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/data.properties");
	prop=new Properties();
	prop.load(fis);
	System.out.println(prop.getProperty("browser"));
	
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) 
	{
	   driver=new ChromeDriver();
		
	}
	else if(browserName.equalsIgnoreCase("edge")) 
	{
		
		 driver=new EdgeDriver();
	}
	return driver;
	
	}
}
