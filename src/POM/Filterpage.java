package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filterpage {
	@FindBy(xpath="//div[@id='allFilterPopupTop']")
	private WebElement filr;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement girl;
	
	@FindBy(id="applyFIlters")
	private WebElement apply;
	
	@FindBy(xpath="//div[@class='remove-icon']")
	private WebElement close;
	
	
	

	public Filterpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void filterbtn()
	{
     filr.click();
	}
	public void girlrad()
	{
    girl.click();
	}
	public void applybtn()
	{
     apply.click();

	}
	public void closebtn()
	{
    close.click();
	}
}
