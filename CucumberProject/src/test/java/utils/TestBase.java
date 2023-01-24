package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	 WebDriver driver;
	
	public  WebDriver WebDriverManager() throws IOException 
	{
		FileInputStream fip=new FileInputStream(System.getProperty("user.dir")+"//src//test//resource//global.properties");
		Properties prop=new Properties();
		prop.load(fip);
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		if (driver==null)
		{
			if (browser.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\patha\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				driver=new ChromeDriver();
				
				
			}
			
			else if (browser.equalsIgnoreCase("firefox")) 
			{
				
				
			}
				
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		return driver;
	}

}
