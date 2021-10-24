Feature: Cozum Merkezi Page Scenarios
Background: 

@P3
Scenario: Customer services call user

Given User is on the Cozum Merkezi page without opening his account with the browser
When User click Sipariş ile ilgili sorum var buton
Then User should see Üye Giriş sayfası & Üye ol page
And User set his email address and password
And User click giriş yap button
Then User should see Sipariş Secin screen
When User chooses the first order listed on Sipariş seçin Page
Then User should see Ürün Seçin screen
When User click the first product
Then User should see chat box screen
When User click Farklı bir konuda sorum var buton on chat box screen
And User click Ürün bilgisi button on the chat box screen
Then User should see Ürün bilgisi tab
When User click Ürünler orijinal midir? on Ürün bilgisi tab 
Then User should see the answer screen for the question user clicked on tab.
When User click Beni arayın button
Then User should see Arama talebi oluştur screen
When User click Gönder button on Arama talebi oluştur screen
Then User should see the request created information on the screen
