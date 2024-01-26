Feature: US002 Google Sayfasi Testi

  Scenario Outline: TC01 Arama Kutusunda Araclar Aratilir

    Given kullanici "googleUrl" sayfasina properties gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test etti
    And sayfayi kapatir
    Examples:
      | aranacakAraclar |
      | volvo           |
      | ford            |
      | audi            |
      | mercedes        |


  #Scenario Outline: Data provider ile aynı mantıkta çalışır.
  #Yukarıdaki örnekteki gibi birden fazla veriyi loop kullanmadan test edebiliriz.
  #Yukarıdaki gibi Examples yapısını kendimiz yazmamıza gerek yok.
  #Mouse ile Scenario üzerine gelince kendiliginden oluşur.
