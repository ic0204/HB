package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HepsiburadaCozumMerkezi_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='btn button-primary-default']//button[1]") public WebElement siparisimİleİlgiliSorumVarButon;
	@FindBy(css="input#txtUserName") public WebElement username;
	@FindBy(xpath="//input[@type='password']") public WebElement password;
	@FindBy(css="button#btnLogin")public WebElement btnLogin;
	@FindBy(xpath="(//div[text()='Sipariş seçin'])[2]") public WebElement siparisSecinScreenTitle;
	@FindBy(xpath="(//div[@class='orders-container']//div)[2]") public WebElement selectedOrderOnSiparisSecınScreen;
	@FindBy(xpath="//div[@id='solution-center']/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]") public WebElement urunSecınScreenTitle;
	@FindBy(xpath="//div[@id='solution-center']/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]") public WebElement selectedOrderUrunSecınScreen;
	@FindBy(xpath="//div[text()='Çözüm Merkezi']") public WebElement chatboxCozumMerkeziText;
	@FindBy(xpath="(//button[@class='chat-bullet-select white']//span)[2]") public WebElement farklıBirKonudaSorumVarButon;
	
	
	@FindBy(xpath="//span[text()='Ürün bilgisi']") public WebElement urunBilgisiButon;
	
	//span[text()='Ürün bilgisi']
	@FindBy(xpath="//div[@id='tab-container']//div[1]") public WebElement urunBilgisiTabText;
	
	
	
	@FindBy(xpath="(//div[@class='cell'])[2]") public WebElement selectUrunlerOrijinalMıdır;
	@FindBy(xpath="(//div[text()='Ürünler orijinal midir?'])[2]") public WebElement answerTextforProduct;
	@FindBy(xpath="(//div[@class='icon-left']/following-sibling::span)[2]") public WebElement beniArayınbuton;
	@FindBy(xpath="(//div[text()='Arama talebi oluştur'])[2]") public WebElement aramaTalebiOlusturTitleText;
	@FindBy(xpath="//button[text()[normalize-space()='Gönder']]") public WebElement gonderButon;
	@FindBy(xpath="//div[@class='tick-icon']/following-sibling::div[1]") public WebElement talebinizOlusturulduTitleText;
	
	public HepsiburadaCozumMerkezi_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
