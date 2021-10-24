package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import steps.HepsiburadaCozumMerkeziSteps;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Common_Steps  {
	
	private WebDriver driver;
	 
	 String browser;
	BrowserType selectedBrowser=BrowserType.CHROME;
	
	
	@Before()
	public void setUp() throws Exception {
		if(selectedBrowser.equals(BrowserType.CHROME)) {
		System.setProperty("webdriver.chrome.driver", "webDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		}
		else if(selectedBrowser.equals(BrowserType.FIREFOX)) {
			System.setProperty("webdriver.gecko.driver", "webDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(1000);
		}
		
	}
	

	@After()
	public void tearDown(Scenario scenario) throws Exception {
		if(scenario.isFailed()) {
			//Take Screenshot
			final byte[] shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//Embed into Report
			scenario.embed(shot, "image/png", scenario.getName());
		}
		driver.quit();
		Thread.sleep(1000);
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	

}
