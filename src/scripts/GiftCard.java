package scripts;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Dresspage;
import POM.Homepage;
import POM.Loginpage;
//import POM.Logoutpage;
import genericlib.Basetest;
//import genericlib.constant;
//import genericlib.constant;
import genericlib.excel;

public class GiftCard extends Basetest {

	//public static void main(String[] args) throws InterruptedException {
	@Test
		public void login() throws InterruptedException
		{
	
		//System.setProperty("webdriver.chrome.driver" ,"./software/chromedriver.exe" );
		//WebDriver driver=new ChromeDriver();
		//String url1 = excel.getdata("sheet1", 1, 2);
		String username1= excel.getdata("sheet1", 2, 2);
		String password1 = excel.getdata("sheet1", 3, 2);
		String search = excel.getdata("sheet1", 4, 2);
		//driver.get(url1);
		Loginpage l=new Loginpage(driver);
	    l.signinbtn();
	    //Thread.sleep(3000);
	    l.email(username1);
	    //Thread.sleep(3000);
	    l.passwordtb(password1);
	    //Thread.sleep(3000);
	    l.loginbtn();
	    //Thread.sleep(3000);
	    Homepage h=new Homepage(driver);
	    h.searchbtn(search);
	    Thread.sleep(3000);
	    h.sebtton();
	    Thread.sleep(3000);
	    Dresspage d= new Dresspage(driver);
	    Thread.sleep(3000);
	  d.dress1();
	   Thread.sleep(3000);
	    d.dresssize();
	    Thread.sleep(3000);
	    
	    d.addcart();
	   // Logoutpage l1=new Logoutpage(driver);
	   // l1.signout();
	    
	}
	}
	   
	   

	    
	    
	    
	
