package stepdefinations;

import org.testng.Assert;
import org.testng.AssertJUnit;

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

public class LandingPageStepDefination {
	
	public WebDriver driver;
	String offerPageText;
	String LoginPageProductName;
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	public LandingPageStepDefination(TestContextSetup testContextSetup)
	{
		
		this.testContextSetup=testContextSetup;
		this.landingPage=testContextSetup.PageObjectManager.getLandingPage();

	}
	
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landinf_page() throws IOException 
	{

		//testContextSetup.testBase.WebDriverManager().get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String title=testContextSetup.testBase.WebDriverManager().getTitle();
		Assert.assertEquals(title, "GreenKart - veg and fruits kart");
		
	}
	
	@When("^User searched with Shortname (.+) and extract actual name of the product$")
	public void user_searched_with_shortname_and_extract_actual_name_of_the_product(String Product) throws InterruptedException
	{
		
		landingPage.searchProduct(Product);
		Thread.sleep(2000);
		testContextSetup.LoginPageProductName=landingPage.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.LoginPageProductName);
	   
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added_items_of_the_selected_product_to_cart(String quantity) 
	{
		landingPage.addItems(quantity);
		landingPage.addToCart();
		
	}
	
//	@When("^User searched with Shortname (.+) and extract actual name of the product$")
//	public void user_searched_with_shortname_and_extract_actual_name_of_the_product(String Product)
//	{
//		
//		landingPage.searchProduct(Product);
//		testContextSetup.LoginPageProductName=landingPage.getProductName().split("-")[0].trim();
//		System.out.println(testContextSetup.LoginPageProductName);
//	   
//	}

	

}
