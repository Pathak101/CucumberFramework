package stepdefinations;

import org.testng.Assert;
import org.testng.AssertJUnit;

import PageObjects.CheckoutPage;
import PageObjects.LandingPage;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class CheckoutPageDefination {
	
	public WebDriver driver;
	public String offerPageText;
	public String LoginPageProductName;
	public CheckoutPage CheckoutPage;
	TestContextSetup testContextSetup;
	
	public CheckoutPageDefination(TestContextSetup testContextSetup)
	{
		
		this.testContextSetup=testContextSetup;
		this.CheckoutPage=testContextSetup.PageObjectManager.getCheckoutPage();

	}
	
	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_Checkout_and_validate_the_items_in_checkoutpage(String name) throws InterruptedException
	{
		CheckoutPage.CheckOutItems();
		Thread.sleep(2000);
		Assert.assertTrue(CheckoutPage.getProductname().contains(name));
	
	}
	
	@Then("Verify that user has ability to enter the promo code and place the order")
	public void Verify_that_user_has_ability_to_enter_the_promocode_and_place_the_order() 
	{
		
		Assert.assertTrue(CheckoutPage.VerifyPromoBtn());
		Assert.assertTrue(CheckoutPage.VerifyPlaceOrder());
		
	}

	

}
