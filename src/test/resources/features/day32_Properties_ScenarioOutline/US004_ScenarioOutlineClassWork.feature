  #https://editor.datatables.net adresine gidiniz
  #Sayfadaki tabloda new butonuna basalım
  #Çıkan pencerede verilen bilgileri girelim
  #Create butonuna basalım
  #Search bölümünde girdigimiz firstname bilgisini girelim
  #Başarılı bir şekilde giriş yapıldığını doğrulayalım
  #Sayfayı kapatalım

  Feature: US004 Datatables testi

    Scenario Outline: TC01 Datatables Veri Girisi
      Given kullanici "dataTablesUrl" sayfasina properties gider
      Then kullanici sayfadaki tabloda new butonuna tiklar
      And  kullanici bilgileri girer "<name>","<lastname>","<position>","<office>","<extention>","<date>","<salary>"
      And  kullanici 2 saniye bekler
      And  kulanici create butonuna basar
      And  kullanici 2 saniye bekler
      Then kullanici search bolumune "<name>" bilgisini girer
      And  kullanici 2 saniye bekler
      And  kullanici "<name>" ile basarili bir sekide giris yapildigini dogrular
      And kullanici 2 saniye bekler
      And sayfayi kapatir

      Examples:
        | name  | lastname  | position  | office  | extention | date       | salary |
        | name1 | lastname1 | position1 | NYC | 2134    | 2023-02-25 | 1100   |
        | name2 | lastname2 | position2 | LA | 5262    | 2023-02-26 | 1205   |
