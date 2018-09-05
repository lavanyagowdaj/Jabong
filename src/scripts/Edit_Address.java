package scripts;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.Accountpage;
import POM.Adresspage;
import POM.Homepage;
import POM.Loginpage;
import genericlib.Basetest;
import genericlib.excel;

public class Edit_Address extends Basetest {
	@Test
	public void login() throws InterruptedException
	{
	//public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver" ,"./software/chromedriver.exe" );
		//WebDriver driver=new ChromeDriver();
		//String url1 = excel.getdata("sheet1", 1, 2);
		String username1= excel.getdata("sheet1", 2, 2);
		String password1 = excel.getdata("sheet1", 3, 2);
		//String search = excel.getdata("sheet1", 4, 2);
		//driver.get(url1);
		Loginpage l=new Loginpage(driver);
		Thread.sleep(3000);
	    l.signinbtn();
	    Thread.sleep(3000);
	    l.email(username1);
	    Thread.sleep(3000);
	    l.passwordtb(password1);
	    Thread.sleep(3000);
	    l.loginbtn();
	    Thread.sleep(3000);
	    Homepage h=new Homepage(driver);
	    Thread.sleep(3000);
	    		h.mouseover(driver);
	    //WebElement ele1 = driver.findElement(By.xpath("//a[.='Hey, lavanya']"));

		//Actions a=new Actions(driver);
		
		//a.moveToElement(ele1).perform();
		Thread.sleep(4000);
		Accountpage ac=new Accountpage(driver);
		Thread.sleep(4000);
		ac.acntpage();
		Thread.sleep(4000);
		ac.adress();
		Thread.sleep(4000);
		ac.addadress();
		String pin = excel.getdata("sheet1",5, 2);
		String name = excel.getdata("sheet1", 6, 2);
		String  adress = excel.getdata("sheet1", 7, 2);
		String phone = excel.getdata("sheet1", 8, 2);
		Adresspage ad=new Adresspage(driver);
		ad.pincode(pin );
		Thread.sleep(4000);
		ad.username(name);
		Thread.sleep(4000);
		ad.fulladres(adress);
		Thread.sleep(4000);
		ad.mbltext(phone);
		Thread.sleep(4000);
		ad.addbtn();
	    
	    
	    
	}
}