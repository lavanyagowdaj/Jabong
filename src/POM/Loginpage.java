package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import genericlib.Basepage;

public class Loginpage{
	@FindBy(xpath="//a[.='Sign In']")
	private WebElement signin;
	
	@FindBy(name="email")
	private WebElement email1;
	
	@FindBy( name="password")
	private WebElement passtb;
	
	@FindBy(id="btn-login")
	private WebElement login;
	
	public Loginpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public void signinbtn()
	{
		signin.click();
	}
	public void email(String us)
	{
		email1.sendKeys(us);
	}
	public void passwordtb(String pwd)
	{
		passtb.sendKeys(pwd);
	}
	public void loginbtn()
	{
		login.click();
	}
}
