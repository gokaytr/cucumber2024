package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Scenario çalıştırıcı notasyon. Cucumber ile junit entegrasyonunu sağlar
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber2.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        //rerun lle belirttiğimiz dosyada fail olan senaryolar tutulur.

        features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@pozitif",
        dryRun = false, // ---> true seçersek scenarioları kontrol eder browseri çalıştırmaz.
        monochrome = true // consoldaki cıktılar tek renk olur.
)
public class Runner1 {
}
