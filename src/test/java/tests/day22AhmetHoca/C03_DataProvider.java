package tests.day22AhmetHoca;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {


    @Test
    public void test01() {
        AmazonPage amazonPage= new AmazonPage();
        //Amazon'a git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //Nutella Arat
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Sonuçların Nutella içerdiğini test edelim.
        String expectedKelime="Nutella";
        String actualKelime=amazonPage.aramaSonucuWE.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));

        Driver.closeDriver();

    }

    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object[][] arananKelimeArrayi = {{"Nutella"}, {"Java"}, {"Çiğdem"}, {"Netherlands"}};
        return arananKelimeArrayi;
    }

    @Test(dataProvider = "AranacakKelimeler")
    //Arayacağımız kelimeleri bir liste gibi tutup bana yollayacak bir veri sağlayıcısı oluşturacağız.

    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonPage= new AmazonPage();
        //Amazon'a git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        //Nutella, Java, Çiğdem ve Netherlands için arama yapalım
        amazonPage.aramaKutusu.sendKeys(arananKelime, Keys.ENTER);


        //sonuçların aradığımız kelime içerdiğini test edelim.
        String expectedKelime=arananKelime;
        String actualKelime=amazonPage.aramaSonucuWE.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));

        //Sayfayı kapatalım.
        Driver.closeDriver();

    }
}
