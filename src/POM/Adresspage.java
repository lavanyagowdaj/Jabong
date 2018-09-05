package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Basepage;

public class Adresspage {
	@FindBy(id="profile-pincode")
	private WebElement pinc;
	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="full-address")
	private WebElement fulladrs;
	
	@FindBy(name="home")
	private WebElement homerad;
	
	@FindBy(id="mobile")
	private WebElement mbl;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement adddrss;
	
	
	public Adresspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void pincode(String code)
	{
     pinc.sendKeys(code);
	}
	public void username(String names)
	{
     name.sendKeys(names);
	}
	public void fulladres(String fadd)
	{
     fulladrs.sendKeys(fadd);
	}
     
     public void mbltext(String mble)
 	{
      mbl.sendKeys(mble);
 	}
     public void addbtn ()
  	{
       adddrss.click();
  	}
     
	}


