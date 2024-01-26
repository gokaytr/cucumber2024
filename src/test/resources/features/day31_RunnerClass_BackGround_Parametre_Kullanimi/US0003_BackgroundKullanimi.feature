@hepsi
Feature: US003 Techproeducation Arama Testi
#Feature file daki scenariolarımızda ortak adımlar var ise bunu feature'dan sonra
# Bacground yapısı ile kullanabiliriz.

  Background: Kullanici techproeducation sayfasina gider.
    Given kullanici techproeducation sayfasina gider

  Scenario: TC01 Arama Kutusunda Bolum Aratma
    Then arama kutusunda qa aratir


  Scenario: TC02 Arama Kutusunda bolum aratma
    Then arama kutusunda mobil aratir
    But cikan dropdown menuden mobile developer secenegine tiklar
    And basligin mobile icerdigini test eder


  Scenario: TC03 Arama Kutusunda bolum aratma
    Then arama kutusunda java aratir
    But cıkan dropdown menuden free java secenegine tiklar
    And basligin Free icerdigini test eder
    And sayfayi kapatir