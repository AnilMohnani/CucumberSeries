package appHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class Hooks {

	private ConfigReader configReader;
	private DriverFactory driverFactory;
	private WebDriver driver;
	Properties prop;
	@Before(order=0)
	public void getProperty()
	{	
		configReader=new ConfigReader();
		prop=configReader.property();
		
	}
	
	@Before(order=1)
		public void launchBrowser()
		{
			String browserName=prop.getProperty("browser");
			driverFactory=new DriverFactory();
			driver=driverFactory.initialiseBrowser(browserName);
			System.out.println(browserName);
		}
	
	@After(order=0)
	public void closeBrowser() {
		driver.quit();
	}
	@After(order=1)
	public void takeScreenshot(Scenario sc)
	{
		String screenshotName=sc.getName().replaceAll(" ", "_");
		byte [] screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(screen, "image/png", screenshotName);
		
	}
	}

