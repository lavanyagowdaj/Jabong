package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basepage;

public class Cartpage{
	@FindBy(xpath="//a[@data-gaq-event='Header~$~Cart~$~']")
	private WebElement itembag;

	@FindBy(xpath="(//a[@class='remove'])[1]")
	private WebElement delete;
	
	
	

	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void bags()
	{
     itembag.click();
	}
	public void remove()
	{
		delete.click();
	}
	

}
