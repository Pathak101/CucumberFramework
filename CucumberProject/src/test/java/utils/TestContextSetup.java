package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import PageObjects.PageObjectManager;

public class TestContextSetup {
	
	//public WebDriver driver;
	public String LoginPageProductName;
	public PageObjectManager PageObjectManager;
	public TestBase testBase;
	public GenricUtils GenricUtils;
	public TestContextSetup() throws IOException
	{
		testBase=new TestBase();
		PageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		GenricUtils=new GenricUtils(testBase.WebDriverManager());
	}

}
