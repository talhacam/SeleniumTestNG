package tests.day22AhmetHoca;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;
import utilities.TestBaseCross;

public class C02_SoftAssertCross extends TestBaseCross {
    @Test
    public void test01() {

        SoftAssert softAssert= new SoftAssert();

        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");

        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"Girdiğiniz kelimeyi içermiyor");

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"WE erişilemez");

        //4-Arama kutusuna Nutella yazıp aratın.
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //Arama yapıldığını test edin.
        WebElement sonuc= driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed(),"Sonuç görüntülenemedi");

        //Arama sonucunun Nutella içerdiğini test edin.
        softAssert.assertTrue(sonuc.getText().contains("Nutella"),"Nutella içermiyor");
        softAssert.assertAll();
        System.out.println("Hata varsa burası çalışmaz");
    }
}
