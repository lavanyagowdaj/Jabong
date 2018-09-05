package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage {
public void elementpresent(WebDriver driver,WebElement element)
{
	try {
		WebDriverWait w= new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present",true);
	}
	catch(Exception e)
	{
		Reporter.log("element is not present",true);
		Assert.fail();
	}
		
	}

public void elementpresent(WebDriver driver, String title)
{
	try {
		WebDriverWait w= new WebDriverWait(driver,10);
		w.until(ExpectedConditions.titleIs(title));
		Reporter.log("element is present",true);
	}
	catch(Exception e)
	{
		Reporter.log("element is not present",true);
		Assert.fail();
		
	}
}
}
