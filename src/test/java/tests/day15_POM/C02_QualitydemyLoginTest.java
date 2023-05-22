package tests.day15_POM;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_QualitydemyLoginTest {

    @Test(groups = "smoke")
    public void test01(){
        // qualitydemy ana sayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        // login linkine tiklayin
        qualitydemyPage.ilkLoginLinki.click();

        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

        // login butonuna basin
        qualitydemyPage.cerezler.click();
        ReusableMethods.bekle(3);
        qualitydemyPage.loginButonu.click();

        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());

        // sayfayi kapatin
        Driver.closeDriver();
    }
}
