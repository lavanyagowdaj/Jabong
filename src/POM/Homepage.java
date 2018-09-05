package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Actionlib;
import genericlib.Basepage;

public class Homepage {
	@FindBy(xpath="//a[.='Hey, lavanya']")
	private WebElement action;

@FindBy(xpath="//input[@id='search']")
private WebElement srchbtn;

@FindBy(xpath="//span[@class='top-search-icon hidden-xs']")
private WebElement sebtn;

@FindBy(xpath="//a[.='Hey, arpitha']")
private WebElement mouse;

public Homepage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void Actions()
{
	action.click();
}

public void searchbtn(String dress)
{
	srchbtn.sendKeys(dress);
}
public void sebtton()
{
	sebtn.click();
}

public void mouseover(WebDriver driver)
{
Actionlib.movetoelement(driver,mouse);
}


}
