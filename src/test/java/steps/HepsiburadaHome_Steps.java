package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HepsiburadaHome_Steps {   
	WebDriver driver;

	@Given("User is on HepsiBurada home page")
	public void user_is_on_HepsiBurada_home_page() {
		System.setProperty("webdriver.chrome.driver", "webDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hepsiburada.com");
		driver.manage().window().maximize(); 

	}

	@When("User is on giriş yap button")
	public void user_is_on_giriş_yap_button() throws Exception {
		WebElement profileIcon = driver.findElement(By.cssSelector("div#myAccount"));
		Actions act = new Actions(driver);
		act.moveToElement(profileIcon).perform();
		Thread.sleep(1000);
		WebElement clickElement = driver.findElement(By.xpath("//a[@id='login']"));
		act.moveToElement(clickElement).click().perform();
		Thread.sleep(1000);

	}

	@Then("User should see login page")
	public void user_should_see_login_page() {
		String exp = "Üye Giriş Sayfası & Üye Ol - Hepsiburada";
		String act = driver.getTitle();
		System.out.println(driver.getTitle());
		if (!exp.equals(act))
			fail("Page does not nagivate Login page");
		driver.quit();
	}
	
	@When("User click Çözüm Merkezi Page")
	public void user_click_Çözüm_Merkezi_Page() {
		driver.findElement(By.xpath("//a[@title='Çözüm Merkezi']")).click();

	}

	@Then("User should see Çözüm Merkezi Page")
	public void user_should_see_Çözüm_Merkezi_Page() {
	   String exptUrl ="https://www.hepsiburada.com/cozummerkezi";
	   String actUrl = driver.getTitle();
	   
	   if(!exptUrl.equals(actUrl))
		   fail("Page does not nagivate Cozum Merkezi Sayfası");
		      
	}
}
