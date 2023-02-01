package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C03_Priority extends TestBaseBeforeClassAfterClass {

    /*Testlerimizi çalıştırırken istediğimiz sıraya göre çalışmasını istersek
    priority methodunu kullanırız

     Priority kullanmazsak default olarak 0 dır
     */

    @Test (priority= 2)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");
        // priority ataması yapmadığımız için 0 kabul etti.
    }

    @Test (priority= 3)
    public void techproTesti() {
        driver.get("https://www.techproeducation.com");
    }

    @Test (priority= -1, groups = "gp1")
    public void hepsiburadaTesti() {
        driver.get("https://www.hepsiburada.com");
        // eksi değer girildiği için önceliği buna verdi ve ilk oalrak hepsiburadaya gidildi.
    }

    //priority koymazsak alfabeye göre testleri çalıştırıyor (Amazon--bestbuy--techpro)
}
