package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TechproStepDefiniton {

    TechproPage techproPage = new TechproPage();

    @Given("kullanici techproeducation sayfasina gider")
    public void kullaniciTechproeducationSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
        }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        techproPage.aramaKutusu.sendKeys("qa", Keys.ENTER);
    }

    @Then("arama kutusunda mobil aratir")
    public void aramaKutusundaMobilAratir() {
        techproPage.aramaKutusu.sendKeys("mobile");
        ReusableMethods.bekle(3);
    }

    @But("cikan dropdown menuden mobile developer secenegine tiklar")
    public void cikanDropdownMenudenMobileDeveloperSecenegineTiklar() {
        techproPage.mobileDevLink.click();
        ReusableMethods.bekle(1);
    }

    @And("basligin mobile icerdigini test eder")
    public void basliginMobileIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mobile"));
    }

    @Then("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        techproPage.aramaKutusu.sendKeys("java");
        ReusableMethods.bekle(2);
    }

    @But("cıkan dropdown menuden free java secenegine tiklar")
    public void cıkanDropdownMenudenFreeJavaSecenegineTiklar() {
        techproPage.freeJavaLink.click();
        ReusableMethods.bekle(2);
    }

    @And("basligin Free icerdigini test eder")
    public void basliginFreeIcerdiginiTestEder() {
    Assert.assertTrue(Driver.getDriver().getTitle().contains("Free"));

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        techproPage.aramaKutusu.sendKeys(str);
    }

    @And("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
