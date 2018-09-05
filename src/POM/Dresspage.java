package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage {

		@FindBy(xpath="//img[@alt='JC Collection Blue Self Design Skater Dress']")
		private WebElement blockdress;

		@FindBy(xpath="//a[@data-size='M']")
		private WebElement size;
		
		@FindBy(name="AddToCart")
		private WebElement cart;

		

		public Dresspage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public void dress1()
		{
			blockdress.click();
		}
		public void dresssize()
		{
			size.click();
		}
		public void addcart()
		{
			cart.click();
		}

}
