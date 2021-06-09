package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.junit.Assert;

public class HomePageTest extends TestBase
{
    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation()
    {
        homePage.clickOnTopMenu();

        //Assert
        String expectedMessage = homePage.menu;
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        Assert.assertEquals("Electronics is not display",expectedMessage,actualMessage);
    }
}



