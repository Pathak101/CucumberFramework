package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
		
	private By cart=By.xpath("//img[@alt='Cart']");
	private By ProceedToCheckOutButton=By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	private By promoBtn=By.xpath("//button[normalize-space()='Apply']");
	private By PlaceOrder=By.xpath("//button[normalize-space()='Place Order']");
	private By productname=By.xpath("//p[@class='product-name']");
	
	public void CheckOutItems() 
	{
		driver.findElement(cart).click();
		driver.findElement(ProceedToCheckOutButton).click();
	}
	
	public boolean VerifyPromoBtn() 
	{
		return driver.findElement(promoBtn).isDisplayed();
		
	}
	
	public boolean VerifyPlaceOrder() 
	{
		return driver.findElement(PlaceOrder).isDisplayed();
		
	}
	
	public String getProductname() 
	{
		return driver.findElement(productname).getText();
		
	}
	
	
	
}
