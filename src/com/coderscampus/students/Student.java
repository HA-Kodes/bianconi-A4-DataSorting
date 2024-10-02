package com.coderscampus.students;

public class Student implements Comparable <Student> {

    private int id;
    private String name;
    private String course;
    private Integer grade;

    public Student(int id, String name, String course, Integer grade) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.grade = grade;

    }

    public String toString() {
        return id + "," + name + "," + course + "," + grade;
    }

    public int getId() {
        return id;

    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public Integer getGrade() {
        return grade;
    }


    @Override
    public int compareTo(Student o) {
        if (o == null || this.getGrade() == null || o.getGrade() == null) return 0;

        return this.getGrade() - o.getGrade();
    }
}
