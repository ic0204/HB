package actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elements.HepsiburadaCozumMerkezi_Elements;
import steps.Common_Steps;

public class HepsiburadaCozumMerkeziPage_Actions {
	 public WebDriver driver;
	HepsiburadaCozumMerkezi_Elements hepsiburadaCozumMerkeziElements;
	
	public HepsiburadaCozumMerkeziPage_Actions(Common_Steps common_steps) {
		this.driver =common_steps.getDriver();
		hepsiburadaCozumMerkeziElements =new HepsiburadaCozumMerkezi_Elements(driver);
	}
	
	public void clickSiparısIleIlgılıSorumvarButon() {
		hepsiburadaCozumMerkeziElements.siparisimİleİlgiliSorumVarButon.click();
	}
	
	public void setEmailAndPassword() {
		hepsiburadaCozumMerkeziElements.username.sendKeys("helin.kerpeten@ozu.edu.tr");
		hepsiburadaCozumMerkeziElements.password.sendKeys("Hk235253");
	}
	
	public void clickGirisYapButon() {
		hepsiburadaCozumMerkeziElements.btnLogin.click();
	}
	public void checkSiparisinSecinScreen() {
		Assert.assertEquals("Sipariş seçin", hepsiburadaCozumMerkeziElements.siparisSecinScreenTitle.getText());
	}
	
	public void chooseFirstOrderListedOnSiparisSecinScreen() {
		hepsiburadaCozumMerkeziElements.selectedOrderOnSiparisSecınScreen.click();
	}
	
	public void checkUrunSecınScreen() {
		Assert.assertEquals("Ürün seçin", hepsiburadaCozumMerkeziElements.urunSecınScreenTitle.getText());
		
	}
	
	public void chooseFirstOrderOnUrunSecınScreen() {
		hepsiburadaCozumMerkeziElements.selectedOrderUrunSecınScreen.click();
	}
	public void clickfarklıBirKonudaSorumVarButon() {
		hepsiburadaCozumMerkeziElements.farklıBirKonudaSorumVarButon.click();
	}
	
	public void checkChatBoxtScreen() {
		Assert.assertEquals("Çözüm Merkezi", hepsiburadaCozumMerkeziElements.chatboxCozumMerkeziText.getText());
	}
	public void clickUrunBilgisiButon() {
		hepsiburadaCozumMerkeziElements.urunBilgisiButon.click();
	}
	
	public void checkUrunBılgısıTab() {
		Assert.assertEquals("Ürün bilgisi", hepsiburadaCozumMerkeziElements.urunBilgisiTabText.getText());
	}
	
	public void clikUrunlerOrijinalMıdır() {
		hepsiburadaCozumMerkeziElements.selectUrunlerOrijinalMıdır.click();
	}
	public void checkTheAnswerScreenForQuestionUserClickedOnTab() {
		Assert.assertEquals("Ürünler orijinal midir?", hepsiburadaCozumMerkeziElements.answerTextforProduct.getText());
	}
	
	public void clickBeniArayınButon() {
		hepsiburadaCozumMerkeziElements.beniArayınbuton.click();
	}
	public void checkAramaTalebiOlusturScreen() {
		Assert.assertEquals("Arama talebi oluştur", hepsiburadaCozumMerkeziElements.aramaTalebiOlusturTitleText.getText());
	}
	public void clickGönderButonOnAramaTalebiOlusturScreen() {
		hepsiburadaCozumMerkeziElements.gonderButon.click();
	}
	
	public void checkTalebinizOlusturduInformation() {
		Assert.assertEquals("Talebiniz oluşturuldu", driver.findElement(By.xpath("//div[@class='tick-icon']/following-sibling::div[1]")).getText());
	}
}
