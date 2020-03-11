package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args)throws Exception {
        testChrome();
        Thread.sleep(2000);
        testEdge();
        Thread.sleep(2000);
        testFirefox();
    }
    public static void testChrome(){
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        driver.manage().window().maximize();
        String googleTitle=driver.getTitle();
        driver.get("http://etsy.com");
        String etsyTitle=driver.getTitle();
        driver.navigate().back();

        String googleTitle2=driver.getTitle();
        StringUtility.verifyEquals(googleTitle,googleTitle2);
        driver.navigate().forward();

        String etsyTitle2=driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyTitle2);

        driver.quit();


    }

    public static void testFirefox(){

        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        driver.manage().window().maximize();
        String googleTitle=driver.getTitle();
        driver.get("http://etsy.com");
        String etsyTitle=driver.getTitle();
        driver.navigate().back();

        String googleTitle2=driver.getTitle();
        StringUtility.verifyEquals(googleTitle,googleTitle2);
        driver.navigate().forward();

        String etsyTitle2=driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyTitle2);

        driver.quit();
    }

    public static void testEdge(){
        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.get("http://google.com");
        driver.manage().window().maximize();
        String googleTitle=driver.getTitle();
        driver.get("http://etsy.com");
        String etsyTitle=driver.getTitle();
        driver.navigate().back();

        String googleTitle2=driver.getTitle();
        StringUtility.verifyEquals(googleTitle,googleTitle2);
        driver.navigate().forward();

        String etsyTitle2=driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyTitle2);

        driver.quit();
    }



}
