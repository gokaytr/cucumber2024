@all

Feature: US001 Techproeducation Arama Testi
  Scenario: TC01 Arama Kutusunda Bolum Aratma
    Given kullanici techproeducation sayfasina gider
    Then arama kutusunda qa aratir
    And sayfayi kapatir

  Scenario: TC02 Arama Kutusunda bolum aratma
    Given kullanici techproeducation sayfasina gider
    Then arama kutusunda mobil aratir
    But cikan dropdown menuden mobile developer secenegine tiklar
    And basligin mobile icerdigini test eder
    And sayfayi kapatir


      @techpro
  Scenario: TC03 Arama Kutusunda bolum aratma
    Given kullanici techproeducation sayfasina gider
    Then arama kutusunda java aratir
    But cıkan dropdown menuden free java secenegine tiklar
    And basligin Free icerdigini test eder
    And sayfayi kapatir