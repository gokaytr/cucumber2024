Feature: US001 Google Sayfasinda Urum Aratma

  Scenario: TC01 Tabloda Verilen Urunler Aratilir
    Given kullanici "googleUrl" sayfasina properties gider
    And kullanici verilen bilgiler ile arama yapar
      | Urunler  |
      | nokia    |
      | samsung  |
      | iphone   |
      | motorola |
    And sayfayi kapatir
