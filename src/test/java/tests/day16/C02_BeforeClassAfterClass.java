package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproTesti() {
        driver.get("https://www.techproeducation.com");
    }
}
