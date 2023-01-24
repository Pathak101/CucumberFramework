package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage LandingPage;
	public CheckoutPage CheckoutPage;
	public OffersPage OfferPage;
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() 
	{
		LandingPage=new LandingPage(driver);
		return LandingPage;
	}
	
	public OffersPage getOffersPage() 
	{
		OfferPage=new OffersPage(driver);
		return OfferPage;
	}
	
	public CheckoutPage getCheckoutPage() 
	{
		CheckoutPage=new CheckoutPage(driver);
		return CheckoutPage;
	}

}
