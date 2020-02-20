package com.jiker.keju;


import java.io.IOException;
import java.util.List;

public class RunTestData {
    List<String> testDataList;

    public RunTestData(String fileName) throws IOException {
        FileReaderNew fileReader = new FileReaderNew(fileName);
        testDataList = fileReader.readTxtFileIntoStringArrList();
    }

    public String showResult() {
        String result = "";
        TaxiCalculater taxiCalculater = new TaxiCalculater();
        for (String data : testDataList) {
            String[] dataArray = data.split(",");
            result += String.format("收费%d元\\n",
                    taxiCalculater.showPrice(Integer.parseInt(dataArray[0]), Integer.parseInt(dataArray[1])));
        }
        return  result;
    }


}
