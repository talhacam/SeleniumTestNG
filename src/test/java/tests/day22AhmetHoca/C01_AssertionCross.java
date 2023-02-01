package tests.day22AhmetHoca;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;
import utilities.TestBaseCross;

public class C01_AssertionCross extends TestBaseCross {
    public void test01() {
        driver.get("https://amazon.com");

        //2-title in Amazon içerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));

        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());

        //4-Arama kutusuna Nutella yazıp aratın.
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //Arama yapıldığını test edin.
        WebElement sonuc= driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.isDisplayed());

        //Arama sonucunun Nutella içerdiğini test edin.
        Assert.assertTrue(sonuc.getText().contains("Nutella"));

    }
}
