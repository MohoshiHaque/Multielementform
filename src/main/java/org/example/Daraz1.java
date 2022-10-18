package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Main.driver;
import static org.openqa.selenium.By.xpath;

public class Daraz1 {


    @Test(priority = 2)
    public void test2() throws InterruptedException {

        //TC-02 --Required Field Check in Login
        WebElement e1 = driver.findElement(xpath("//*[@id=\"anonLogin\"]/a"));
        e1.click();
        WebElement e2 = driver.findElement(xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button"));
        e2.click();
        String Expectresultemail = "You can't leave this empty.";
        String Actualresultemail = driver.findElement(xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/span")).getText();
        Assert.assertEquals(Actualresultemail, Expectresultemail);
        Thread.sleep(3000);

        //TC-03 -- Valid Email & Password check
        WebElement e3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input"));
        e3.sendKeys("bugresistance@gmail.com");
        WebElement e4 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input"));
        e4.sendKeys("123456abc");
        e2.click();
        Thread.sleep(3000);
    }
}
