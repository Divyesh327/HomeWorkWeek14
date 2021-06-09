package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DesktopTest
{

    public class ComputerTest extends TestBase
    {
        DesktopPage DesktopPage = new DesktopPage();

        @Test
        public void verifyProductArrangeInAlphabeticalOrder()
        {
            DesktopPage.descendingOrder();
        }

        @Test
        public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException
        {
            DesktopPage.ascendingOrder();
        }
    }
}
