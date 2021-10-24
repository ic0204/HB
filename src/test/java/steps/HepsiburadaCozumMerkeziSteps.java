package steps;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import actions.Common_Actions;
import actions.HepsiburadaCozumMerkeziPage_Actions;
import elements.HepsiburadaCozumMerkezi_Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HepsiburadaCozumMerkeziSteps {
	WebDriver driver;
	
	HepsiburadaCozumMerkeziPage_Actions action;
	Common_Actions common_actions;
	String browser;
	
	
	public HepsiburadaCozumMerkeziSteps(Common_Actions common_actions ,HepsiburadaCozumMerkeziPage_Actions hepsiburada_cozum_merkezi_page_action) {
		this.common_actions =common_actions;
		this.action= hepsiburada_cozum_merkezi_page_action;
		this.driver=hepsiburada_cozum_merkezi_page_action.driver;
		
	}	

	@Given("User is on the Cozum Merkezi page without opening his account with the browser")
	public void user_is_on_the_Cozum_Merkezi_page_without_opening_his_account_with_the_browser() throws Exception {
		common_actions.goToUrl("https://www.hepsiburada.com/cozummerkezi");
		Thread.sleep(2000);
	}
	
	@When("User click Sipariş ile ilgili sorum var buton")
	public void user_click_Sipariş_ile_ilgili_sorum_var_buton() throws Exception {
	action.clickSiparısIleIlgılıSorumvarButon();
	   Thread.sleep(5000);
	}

	@Then("User should see Üye Giriş sayfası & Üye ol page")
	public void user_should_see_Üye_Giriş_sayfası_Üye_ol_page() throws Exception {
		String expResult ="Üye Giriş Sayfası & Üye Ol - Hepsiburada";
		String actResult =common_actions.getCurrentPageTitle();
		Assert.assertEquals(expResult, actResult);
		Thread.sleep(2000);
	
	}

	@Then("User set his email address and password")
	public void user_set_his_email_address_and_password() throws Exception {
		action.setEmailAndPassword();
		Thread.sleep(2000);
	}

	@And("User click giriş yap button")
	public void user_click_giriş_yap_button() throws Exception {
		action.clickGirisYapButon();
		Thread.sleep(3000);
	}

	@Then("User should see Sipariş Secin screen")
	public void user_should_see_Sipariş_Secin_screen() throws Exception {
		action.checkSiparisinSecinScreen();
		Thread.sleep(3000);
	}

	@When("User chooses the first order listed on Sipariş seçin Page")
	public void user_chooses_the_first_order_listed_on_sipariş_seçin_page() throws Exception {
		action.chooseFirstOrderListedOnSiparisSecinScreen();
		Thread.sleep(3000);
	} 

	@Then("User should see Ürün Seçin screen")
	public void user_should_see_Ürün_Seçin_screen() throws Exception {
		action.checkUrunSecınScreen();
		Thread.sleep(3000);
	}

	@When("User click the first product")
	public void user_click_the_first_product() throws Exception {
		action.chooseFirstOrderOnUrunSecınScreen();
		Thread.sleep(3000);
	}

	@Then("User should see chat box screen")
	public void user_should_see_chat_box_screen() throws Exception {
		action.checkChatBoxtScreen();
		Thread.sleep(3000);
	}

	@When("User click Farklı bir konuda sorum var buton on chat box screen")
	public void user_click_Farklı_bir_konuda_sorum_var_buton_on_chat_box_screen() throws Exception {
		action.clickfarklıBirKonudaSorumVarButon();
		Thread.sleep(5000);
	}

	@When("User click Ürün bilgisi button on the chat box screen")
	public void user_click_Ürün_bilgisi_button_on_the_chat_box_screen() throws Exception {
		action.clickUrunBilgisiButon();
		Thread.sleep(5000);
	}

	@Then("User should see Ürün bilgisi tab")
	public void user_should_see_Ürün_bilgisi_tab() throws Exception {
		action.checkUrunBılgısıTab();
		Thread.sleep(3000);
	}

	@When("User click Ürünler orijinal midir? on Ürün bilgisi tab")
	public void user_click_Ürünler_orijinal_midir_on_Ürün_bilgisi_tab() throws Exception {
		action.clikUrunlerOrijinalMıdır();
	 Thread.sleep(3000);
	}

	@Then("User should see the answer screen for the question user clicked on tab.")
	public void user_should_see_the_answer_screen_for_the_question_user_clicked_on_tab() throws Exception {
		action.checkTheAnswerScreenForQuestionUserClickedOnTab();
		Thread.sleep(3000);
	}

	@When("User click Beni arayın button")
	public void user_click_Beni_arayın_button() throws Exception {
		action.clickBeniArayınButon();
		Thread.sleep(3000);
	}

	@Then("User should see Arama talebi oluştur screen")
	public void user_should_see_Arama_talebi_oluştur_screen() throws Exception {
		action.checkAramaTalebiOlusturScreen();
		Thread.sleep(3000);
	}

	@When("User click Gönder button on Arama talebi oluştur screen")
	public void user_click_Gönder_button_on_Arama_talebi_oluştur_screen() throws Exception {
		action.clickGönderButonOnAramaTalebiOlusturScreen();
	   Thread.sleep(3000);
	}

	@Then("User should see the request created information on the screen")
	public void user_should_see_the_request_created_information_on_the_screen() throws Exception {
		action.checkTalebinizOlusturduInformation();
		Thread.sleep(3000);
	}

}
