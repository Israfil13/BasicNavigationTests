package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws Exception{
//        WebDriver driver=BrowserFactory.getDriver("chrome");

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com","https://westelm.com/");

        for (String each:urls){
            WebDriver driver=BrowserFactory.getDriver("chrome");
            driver.get(each);
            Thread.sleep(3000);
            driver.close();
        }
    }
}
