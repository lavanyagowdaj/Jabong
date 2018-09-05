package genericlib;

//import org.junit.Assert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITestResult;
//import org.testng.ITestResult;
//import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class Basetest implements constant{
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp() throws InterruptedException
	{
      System.setProperty(key, value);
	driver=new ChromeDriver();
	Thread.sleep(3000);
		String url1 = excel.getdata("sheet1", 1, 2);
		Thread.sleep(3000);
		driver.get(url1);
		
	}
	
	@AfterMethod()
	public void closeapp()
	{
		driver.close();
		
	}

}
