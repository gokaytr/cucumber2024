package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.awt.event.KeyAdapter;

public class AmazonStepDefinition {

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanici arama kutusunda iphone aratir")
    public void kullanici_arama_kutusunda_iphone_aratir() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
    }
    @And("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici arama kutusunda samsung aratir")
    public void kullaniciAramaKutusundaSamsungAratir() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("samsung", Keys.ENTER);
    }
}
