package testcases;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import Pages.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage {
	
	@Test
	public void testHomePage()
	{
		WebDriver driver = BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		
//		HomePage home = PageFactory.initElements(driver, HomePage.class);
	}

}
