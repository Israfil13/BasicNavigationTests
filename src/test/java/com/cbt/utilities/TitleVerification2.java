package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args)throws Exception{
     WebDriver driver= BrowserFactory.getDriver("chrome");

        List<String> urls = Arrays.asList("https://wayfair.com/",
                                          "https://walmart.com",
                                            "https://westelm.com/",
                                            "https://luluandgeorgia.com");

        for (String eachurl:urls){
         driver.get(eachurl);
         Thread.sleep(4000);

         String url=driver.getCurrentUrl();
         String title=driver.getCurrentUrl().trim().toLowerCase();

         if (url.contains(title)){
             System.out.println("Test Passed");
            }else{
             System.out.println("Test Failed");
        }


        }

        driver.quit();

    }
}
