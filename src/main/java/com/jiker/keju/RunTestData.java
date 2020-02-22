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
        for (String data : testDataList) {
            String[] dataArray = data.split(",");
            result += String.format("收费%d元\n",
                    new TaxiCalculater().showPrice(Integer.parseInt(dataArray[0].replaceAll("\\D", "")),
                            Integer.parseInt(dataArray[1].replaceAll("\\D", ""))));
        }
        return  result;
    }


}
