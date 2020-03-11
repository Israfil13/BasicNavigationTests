package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected,String actual){
        if (expected.equals(actual)){
            System.out.println("Expected "+expected);
            System.out.println("Actual "+actual);
            System.out.println("PASS");
        }else{
            System.out.println("Expected "+expected);
            System.out.println("Actual "+actual);
            System.out.println("FAILED");
        }
    }
}
