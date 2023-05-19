package tests.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.SaucedemoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.ObjectInputFilter;

public class P03 {
    /*
       Navigate to https://www.saucedemo.com/
       Enter the username as standard_user
       Enter the password as secret_sauce
       Click on login button
       Test 1: Choose price low to high
       Test 2:Verify item prices are sorted from Iow to high with soft Assert
     */
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));
        SaucedemoPage saucedemoPage = new SaucedemoPage();
        saucedemoPage.name.sendKeys("standard_user");
        saucedemoPage.password.sendKeys("secret_sauce");
        saucedemoPage.login.click();
        Select select =new Select(saucedemoPage.dropDownMenu);
        select.selectByValue("lohi");
        Assert.assertTrue(saucedemoPage.dusuktenYuksege.isDisplayed());
        Driver.closeDriver();
    }
}
