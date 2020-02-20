package com.jiker.keju;

import org.junit.Test;

import java.io.IOException;

public class RunTestDataTest {
    @Test
    public void should_return_result_when_given_test_file() throws IOException {
        RunTestData  runTestData = new RunTestData("testData.txt");
        assert runTestData.showResult().equals("收费6元\\n收费7元\\n收费13元\\n收费7元\\n");
    }
}
