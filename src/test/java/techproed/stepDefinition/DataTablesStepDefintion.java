package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablesPage;

public class DataTablesStepDefintion {

    DataTablesPage dataTablesPage = new DataTablesPage();
    @Then("kullanici sayfadaki tabloda new butonuna tiklar")
    public void kullaniciSayfadakiTablodaNewButonunaTiklar() {
        dataTablesPage.newButton.click();

    }

    @And("kullanici bilgileri girer {string},{string},{string},{string},{string},{string},{string}")
    public void kullaniciBilgileriGirer(String name, String lastname, String position, String office, String extention, String date, String salary) {
    dataTablesPage.firstName.sendKeys(name,Keys.TAB,lastname,Keys.TAB,position,Keys.TAB,office,Keys.TAB,extention,Keys.TAB,date,Keys.TAB,salary);

    }

    @And("kulanici create butonuna basar")
    public void kulaniciCreateButonunaBasar() {
    dataTablesPage.createButton.click();
    }

    @Then("kullanici search bolumune {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String str) {
        dataTablesPage.searchBox.sendKeys(str);
    }


    @And("kullanici {string} ile basarili bir sekide giris yapildigini dogrular")
    public void kullaniciIleBasariliBirSekideGirisYapildiginiDogrular(String str) {
        Assert.assertTrue(dataTablesPage.searchVerify.getText().contains(str));
    }
}
