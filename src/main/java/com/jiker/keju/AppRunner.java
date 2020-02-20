package com.jiker.keju;

import java.io.IOException;

public class AppRunner {

    public static void main(String[] args) throws IOException {
        String testDataFile = args[0];
        String receipt = new RunTestData(testDataFile).showResult();
        System.out.println(receipt);
    }
}
