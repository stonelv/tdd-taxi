package com.jiker.keju;

import java.io.IOException;

public class AppRunner {

    public static void main(String[] args) {
        String testDataFile = args[0];
        String receipt = "";
        try {
            receipt = new RunTestData(testDataFile).showResult();
        } catch (IOException ex) {
            receipt = ex.getMessage();
        }
        System.out.println(receipt);
    }
}
