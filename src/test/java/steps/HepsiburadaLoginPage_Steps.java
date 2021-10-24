package steps;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HepsiburadaLoginPage_Steps {
	WebDriver driver;
	
	@Given("User in on Hepsiburada Login Page")
	public void user_in_on_Hepsiburada_Login_Page() throws Exception {
		String expResult ="Üye Giriş Sayfası & Üye Ol - Hepsiburada";
		String actResult =driver.getTitle();
		Assert.assertEquals(expResult, actResult);
		Thread.sleep(2000);
	}

	@When("User set the email adrees and pasword")
	public void user_set_the_email_adrees_and_pasword() throws Exception {
		driver.findElement(By.cssSelector("input#txtUserName")).sendKeys("helin.kerpeten@ozu.edu.tr");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hk235253");
		Thread.sleep(2000);
	}

	@Then("User click the Giriş yap buton")
	public void user_click_the_Giriş_yap_buton() throws Exception {
		driver.findElement(By.cssSelector("button#btnLogin")).click();
		Thread.sleep(3000);
	}

}
