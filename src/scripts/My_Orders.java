package scripts;

import org.testng.annotations.Test;

import POM.Filterpage;
import POM.Homepage;
import POM.Loginpage;
import genericlib.Basetest;
import genericlib.excel;

public class My_Orders extends Basetest{
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
	    Filterpage f=new Filterpage(driver);
	    //Thread.sleep(3000);
	    f.filterbtn();
	    Thread.sleep(3000);
	    
	    Thread.sleep(3000);
	  
	    
	    f.girlrad();
	    Thread.sleep(3000);
	    //f.applybtn();
	    
	    //driver.close();
}
}


