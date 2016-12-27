package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
		{
		this.driver=ldriver;	
		}
	
  @FindBy(xpath=".//a[text()='Signup']") WebElement SignUpLink;
  
  public void clickOnSignLink()
  {
	  SignUpLink.click();
  }
  
}
