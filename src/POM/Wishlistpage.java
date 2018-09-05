package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import genericlib.Basepage;

public class Wishlistpage  {
	@FindBy(xpath=" //button[@class='btn btn-save-for-later  js-btn-save-later wishlist-button-mweb'] ")
	private WebElement wish;
	
	
	

	public Wishlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void wishlbtn()
	{
     wish.click();
	}
}
