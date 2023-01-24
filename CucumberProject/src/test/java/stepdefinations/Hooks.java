package stepdefinations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.apache.commons.io.FileUtils;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
    TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup)
	{
		
		this.testContextSetup=testContextSetup;

	}
	
	@After
	public void AfterScenario() throws IOException 
	{
		testContextSetup.testBase.WebDriverManager().quit();
	}
	
//	@After
//	public void AddScreenShots(Scenario scenario) throws IOException
//	{
//		WebDriver driver=testContextSetup.testBase.WebDriverManager();
//		if (scenario.isFailed())
//		{
//			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(sourcePath, "");
//			byte[] filecontent=new FileUtils.readFileToByteArray(sourcePath);
//			scenario.attach(filecontent, "image/png", "image");
//		}
//	}

}
