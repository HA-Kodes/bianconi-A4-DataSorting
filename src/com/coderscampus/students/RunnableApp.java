package com.coderscampus.students;

import java.util.Arrays;
import java.util.Collections;

public class RunnableApp {

    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        Student[] studentList = reader.getAllStudentInformation("student-master-list.csv");
        Student[] course1 = new Student[100];
        Student[] course2 = new Student[100];
        Student[] course3 = new Student[100];
        int course1Index = 0;
        int course2Index = 0;
        int course3Index = 0;

        for (Student student : studentList) {
            if (student.getCourse().startsWith("COMPSCI")) {
                course1[course1Index++] = student;

            } else if (student.getCourse().startsWith("APMTH")) {
                course2[course2Index++] = student;
            } else {
                course3[course3Index++] = student;
            }
        }
        course1 = Arrays.copyOf(course1, course1Index);
        Arrays.sort(course1, Collections.reverseOrder());

        course2 = Arrays.copyOf(course2, course2Index);
        Arrays.sort(course2, Collections.reverseOrder());

        course3 = Arrays.copyOf(course3, course3Index);
        Arrays.sort(course3, Collections.reverseOrder());

        CSVWriter writer = new CSVWriter();
        writer.write("course1.csv", course1);
        writer.write("course2.csv", course2);
        writer.write("course3.csv", course3);

/*      Students[] apmthList = Arrays.copyOf(studentList, 33);
        Arrays.sort(apmthList, new SortGradeComparator());
        System.out.println(Arrays.toString(apmthList));

        Students[] compsciList = Arrays.copyOfRange(studentList, 33, 67);
        Arrays.sort(compsciList, new SortGradeComparator());
        System.out.println(Arrays.toString(compsciList));

        Students[] statList = Arrays.copyOfRange(studentList, 67, 100);
        Arrays.sort(statList, new SortGradeComparator());
        System.out.println(Arrays.toString(statList));

        SortStudents.writer("course1.csv", compsciList);
        SortStudents.writer("course2.csv", apmthList);
        SortStudents.writer("course3.csv", statList);
*/
    }

}
