package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class ScreenShotReusableMethod {
    @Test
    public void test01() throws IOException {
        //Hepsiburada ya git ve sayfanın resmini al
        Driver.getDriver().get("https://hepsiburada.com");

        ReusableMethods.getScreenshot("hepsiburada");

        Driver.closeDriver();


    }

    @Test
    public void test02() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amznPage = new AmazonPage();

        //Nutella arat
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //Arama sonuc yazısının webelementinin resminin al
        ReusableMethods.getScreenshotWebElement("AramaSonucuWE", amznPage.aramaSonucuWE);
    }
}
