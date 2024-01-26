Feature: US001 Google Testi


  @arac1
  Scenario: TC01 Arama Kutusunda Volvo Aratilir
    Given kullanici "googleUrl" sayfasina properties gider
    Then kullanici arama kutusunda "arac1" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac2" icerdigini test eder
    And sayfayi kapatir

  @arac2
  Scenario: TC02 Arama Kutusunda Volvo Aratilir
    Given kullanici "googleUrl" sayfasina properties gider
    Then kullanici arama kutusunda "arac2" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac2" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC03 Arama Kutusunda Volvo Aratilir
    Given kullanici "googleUrl" sayfasina properties gider
    Then kullanici arama kutusunda "arac3" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac2" icerdigini test eder
    And sayfayi kapatir