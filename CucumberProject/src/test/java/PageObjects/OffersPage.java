package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
	WebDriver driver;
	
	public OffersPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By search=By.xpath("//input[@type='search']");
	private By ProductName=By.xpath("//td[contains(text(),'Tomato')]");
	
	
	public void searchItem(String Product) 
	{
		driver.findElement(search).sendKeys(Product);
	}
	
	public void getSearchText() 
	{
		driver.findElement(search).getText();
	}
	
	public String getProductName() 
	{
		return driver.findElement(ProductName).getText();
	}
}
