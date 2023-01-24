package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenricUtils {
	
	WebDriver driver;
	
	GenricUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchWindows() 
	{
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> it=windowHandles.iterator();
		String Parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
	}
	

}
