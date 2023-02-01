package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {
    @Test
    public void test01() {

        String urlAmazon= ConfigReader.getProperty("amazonUrl");
        String urlFacebook= ConfigReader.getProperty("facebookUrl");
        Driver.getDriver().get(urlAmazon);
        Driver.getDriver().get(urlFacebook);
        Driver.closeDriver();

        // Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));  Bu şekilde de olur.

    }
}
