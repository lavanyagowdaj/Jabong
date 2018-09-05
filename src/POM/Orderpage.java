package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basepage;

public class Orderpage {

	@FindBy(xpath="//a[.='PLACE ORDER']")
	private WebElement orders;
	
	
	

	public Orderpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void orderbtn()
	{
    orders.click();
	}
}
