package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By search=By.cssSelector("input.search-keyword");
	private By ProductName=By.xpath("//h4[@class='product-name']");
	private By topDeals=By.xpath("//a[contains(text(),'Top Deals')]");
	private By addButton=By.xpath("//a[normalize-space()='+']");
	private By addToCartButton=By.xpath("//button[normalize-space()='ADD TO CART']");
	
	public void searchProduct(String Product) 
	{
		driver.findElement(search).sendKeys(Product);
	}
	
	public String getProductName() 
	{
		return driver.findElement(ProductName).getText();
	}
	
	public void selectTopDeals() 
	{
		driver.findElement(topDeals).click();
	}
	
	public void addItems(String quantity) 
	{
		for (int i = 0; i < quantity.length(); i++) 
		{
			driver.findElement(addButton).click();
		}
		
	}
	
	public void addToCart() 
	{
		driver.findElement(addToCartButton).click();
		
	}
	
}
