package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import genericlib.Basepage;

public class Bagpage {

	@FindBy(xpath="//a[.='View Bag']")
	private WebElement viewbag;
	
	
	

	public Bagpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void bags()
	{
     viewbag.click();
	}
}
