package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage1 {

	@FindBy(xpath=("//img[@alt='JC Collection Light Blue Solid Skater Dress']"))
	private WebElement bludress;
	
	@FindBy(xpath=("//img[@alt='Label Ritu Kumar Peach Self Design Maxi Dress']"))
	private WebElement pinkdress;
	
	@FindBy(xpath=("//img[@alt='Miss Chase Khaki Solid Shift Dress']"))
	private WebElement  shortdress;

	@FindBy(xpath="//a[@data-size='S']")
	private WebElement dressize;
	
	@FindBy(name="AddToCart")
	private WebElement cart1;

	

	public Dresspage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public void bluedres()
	{
		bludress.click();
	}
	public void pnkdres()
	{
		pinkdress.click();
	}
	public void shrtdress()
	{
shortdress.click();
	}
	public void bldrsz()
	{
		dressize.click();
	}
	public void dressaddcart()
	{
		cart1.click();
	}
}
