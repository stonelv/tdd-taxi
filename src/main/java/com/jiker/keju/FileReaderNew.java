package com.jiker.keju;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderNew {
    private String _fileName;
    public FileReaderNew(String fileName) {
        _fileName = fileName;
    }

    public List<String> readTxtFileIntoStringArrList() throws IOException {
        File file = new File("src/main/resources/" + _fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf8"));
        return getListFromBufferedReader(bufferedReader);
    }

    private List<String> getListFromBufferedReader(BufferedReader bufferedReader) throws IOException {
        String lineTxt = "";
        List<String> list = new ArrayList<>();
        while ((lineTxt = bufferedReader.readLine()) != null) {
            list.add(lineTxt);
        }
        bufferedReader.close();
        return list;
    }
}
