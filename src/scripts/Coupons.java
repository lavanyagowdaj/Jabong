package scripts;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Cartpage;
import POM.Dresspage1;
import POM.Homepage;
//import POM.Dresspage;
//import POM.Homepage;
import POM.Loginpage;
import POM.Logoutpage;
import genericlib.Basetest;
import genericlib.excel;

public class Coupons extends Basetest  {
	
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
	    Thread.sleep(3000);
	    dr.bldrsz();
	    Thread.sleep(3000);
	    dr.dressaddcart();
	    Thread.sleep(3000);Cartpage c= new Cartpage(driver);
	    c.bags();
	    Thread.sleep(3000);
	    c.remove();
	   
	    
	 
	    
	    
	    
	    
	}
}