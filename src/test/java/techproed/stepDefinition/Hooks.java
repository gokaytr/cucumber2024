package techproed.stepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;


public class Hooks {

    /*

    Hooks class'ının kullanım amacı scenariolardan önce veya sonra çalışmasını istediğimiz kodları belirttiğimiz class'tır.
    Bunları before ve after notasyonlarına sahip methodlar ile yaparız. importu i.o cucumber dan olmalıdır.

     */

    @Before
    public void setUp() throws Exception {
        System.out.println("Scenariolar çalışmaya başladı");
    }

    @Before("@arac2")
    public void setUp2(){
        System.out.println("Google'da ford aratildi");

    }
    @Before("@arac3")
    public void setUp3(){
        System.out.println("Google'da audi aratildi");

    }
    /*
    Scenario'dan önce çalışmasını istedigimiz @before methodunun notasyonuna parametre
    olarak scenarioyaya tanımladıgmız tagı belirtebiliriz.Dolayısıyla
    sadece parametre olarak belirttiğimiz @before methodu scenariodan önce çalışacaktır.
     */


    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()){ //-->Scenario fail olursa
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg","scenario_"+scenario.getName());
            Driver.closeDriver();
         }

    }
    //bu method fail olan scenario'larda farklı olan kısmın resmini rapora ekleyecektir.
}
