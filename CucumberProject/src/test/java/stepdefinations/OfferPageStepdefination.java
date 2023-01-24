package stepdefinations;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class OfferPageStepdefination {

	public WebDriver driver;
	String offerPageText;
	TestContextSetup testContextSetup;
	
	public OfferPageStepdefination(TestContextSetup testContextSetup)
	{
		
		this.testContextSetup=testContextSetup;

	}
	
	@Then("^User searched for the (.+) Shortname in offers Page to check if product exist$")
	public void user_searched_for_the_same_shortname_in_offers_page_to_check_if_product_exist(String Shortname)
	{
		LandingPage LandingPage=testContextSetup.PageObjectManager.getLandingPage();
		LandingPage.selectTopDeals();
		testContextSetup.GenricUtils.switchWindows();;
		OffersPage OfferPage=testContextSetup.PageObjectManager.getOffersPage();
		OfferPage.searchItem(Shortname);
		offerPageText=OfferPage.getProductName();	
		
	}
	
	@Then("validate the product name in offer page matches with Landing Page")
	public void validate_the_product_name_in_offer_page_matches_with_landing_page() throws IOException 
	{
	    Assert.assertEquals(offerPageText,testContextSetup.LoginPageProductName);
		testContextSetup.testBase.WebDriverManager().quit();
	}
	
	
}
