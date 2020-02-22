package com.jiker.keju;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class FileReaderTest {
    @Test
    public void should_return_list_from_lines_when_given_file_name() throws IOException {
        FileReaderNew fileReader = new FileReaderNew("testData.txt");
        List<String> list = fileReader.readTxtFileIntoStringArrList();
        assert list.size() == 4;
        assert list.get(1).isEmpty() == false;
    }
}
