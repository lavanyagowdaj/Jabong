package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basepage;

public class Accountpage {
	@FindBy(xpath="//a[@data-gaq-event='Header~$~My_account']")
	private WebElement accnt;
	
	@FindBy(xpath="//a[@href='/account/addresses/']")
	private WebElement address;
	
	@FindBy(xpath="//button[.='add a new address']")
	private WebElement addadrs;
	
	
	public Accountpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void acntpage()
	{
     accnt.click();
	}
	public void adress()
	{
     address.click();
	}
	public void addadress()
	{
     addadrs.click();
	}
}
