package scripts;


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Dresspage1;

import POM.Homepage;
import POM.Loginpage;
import POM.Wishlistpage;
import genericlib.Basetest;
import genericlib.excel;

public class Add_Product_wishlist extends Basetest {
	@Test
	public void login() throws InterruptedException
	{

	//public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver" ,"./software/chromedriver.exe" );
		//WebDriver driver=new ChromeDriver();
		//String url1 = excel.getdata("sheet1", 1, 2);
		String username1= excel.getdata("sheet1", 2, 2);
		String password1 = excel.getdata("sheet1", 3, 2);
		String search = excel.getdata("sheet1", 4, 2);
		//driver.get(url1);
		Loginpage l=new Loginpage(driver);
	    l.signinbtn();
	    Thread.sleep(3000);
	    l.email(username1);
	    Thread.sleep(3000);
	    l.passwordtb(password1);
	    Thread.sleep(3000);
	    l.loginbtn();
	    Homepage h=new Homepage(driver);
	    Thread.sleep(3000);
	    h.searchbtn(search);
	    Thread.sleep(3000);
	    h.sebtton();
	    Thread.sleep(3000);
	    Dresspage1 dr=new Dresspage1(driver);
	    Thread.sleep(3000);
	    dr.shrtdress();
	 Wishlistpage w=new Wishlistpage(driver);
	  Thread.sleep(3000);
	  w.wishlbtn();
	    
	    
	}
}