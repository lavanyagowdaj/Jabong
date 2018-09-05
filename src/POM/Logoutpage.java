package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basepage;

public class Logoutpage  {
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	
	

	public Logoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void signout()
	{
     logout.click();
	}

}
