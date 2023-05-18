package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C06_QualitydemyNegatifLoginTesti {

    @Test
    public void test01(){
        // qualitydemy ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // login linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // gecersiz username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        qualitydemyPage.cerezler.click();
        ReusableMethods.bekle(3);
        qualitydemyPage.loginButonu.click();

        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        // sayfayi kapatin
        Driver.closeDriver();

    }
}
