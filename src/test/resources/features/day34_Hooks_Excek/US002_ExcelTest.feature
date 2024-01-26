Feature: US002 BlueRentalCar Excel Login
  Scenario: TC01 Pozitif Login Testi
    Given kullanici "blueRentalUrl" sayfasina properties gider
    And kullanici 2 saniye bekler
    And kullanici exceldeki "admin_info" sayfasindaki bilgler ile giris yapip giris yapildigini test eder
    And sayfayi kapatir
 #bu eksik kaldı, sifre ve mailler hatalı.


