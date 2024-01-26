Feature: US002 BlueRentalCar Login Islemi

  Scenario: TC01 BlueRentalCar Pozitif Test
    Given kullanici "blueRentalUrl" sayfasina properties gider
    Then kullanici login buttonuna tiklar
    But kullanici 2 saniye bekler
    And kullanici tabloda verilen bilgiler ile login olur
      | e-mail                        | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |
    And sayfayi kapatir

