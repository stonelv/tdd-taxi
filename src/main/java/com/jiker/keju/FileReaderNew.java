package com.jiker.keju;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class FileReaderNew {
    private String fileName;

    public FileReaderNew(String fileName) {
        this.fileName = fileName;
    }

    public List<String> readTxtFileIntoStringArrList() throws IOException {
        File file = new File("src/main/resources/" + fileName);
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
