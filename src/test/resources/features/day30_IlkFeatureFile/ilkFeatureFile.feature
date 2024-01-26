Feature: US001 Amazon Sayfasi Testi
  Scenario: TC01 Arama kutusunda urun aratma
    Given kullanici amazon sayfasina gider
    Then kullanici arama kutusunda iphone aratir
    And sayfayi kapatir

  Scenario: TC02 Arama Kutusunda urun aratma
    Given kullanici amazon sayfasina gider
    Then kullanici arama kutusunda samsung aratir
    And sayfayi kapatir