package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Main.driver;

public class Daraz {

    @Test(priority = 1)
    public void test1() throws InterruptedException {

        String url = "https://www.daraz.com.bd/";
        driver.get(url);

        //TC-01-- Title Verify
        String expectTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectTitle);
        Thread.sleep(3000);
    }
}
