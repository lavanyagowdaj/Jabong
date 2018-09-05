package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logpage {
	@FindBy(id="signin-model-wishlist")
	private WebElement signin;
	
	@FindBy(id="login-email")
	private WebElement email1;
	
	@FindBy(id="login-pwd")
	private WebElement passtb;
	
	@FindBy(id="btn-login")
	private WebElement login;
	
	public Logpage (WebDriver driver)
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
