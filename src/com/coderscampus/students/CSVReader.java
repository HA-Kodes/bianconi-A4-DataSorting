package com.coderscampus.students;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public Student[] getAllStudentInformation(String filelocation) {
        Student[] students = new Student[100];
        int index = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filelocation));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                line = line.trim();
                String[] data = line.split(",");
                if (data.length != 4) {
                    System.out.println("Incorrect data found on " + line);
                    continue;
                }

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String course = data[2].toUpperCase();
                Integer grade = Integer.parseInt(data[3]);

                Student student = new Student(id, name, course, grade);
                students[index] = student;
                index++;
            }
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return students;
    }
}
