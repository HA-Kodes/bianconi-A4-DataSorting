package com.coderscampus.students;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVWriter {

    public void write(String fileName, Student[] data) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName));
            int index = 0;
            for (int i =0; i<data.length; i ++) {
                pw.write(data[i]+"\n");
            }
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
