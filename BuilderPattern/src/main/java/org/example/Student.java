package org.example;

import java.util.List;

public class Student {

    private Integer id;
    public String name;
    public Integer rollNo;
    public String fatherName;
    public String motherName;
    public String address;
    public String phoneNo;
    public String email;
    public List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.rollNo = studentBuilder.rollNo;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.address = studentBuilder.address;
        this.phoneNo = studentBuilder.phoneNo;
        this.email = studentBuilder.email;
        this.subjects = studentBuilder.subjects;
    }

    public void printDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Father's Name: " + this.fatherName);
        System.out.println("Mother's Name: " + this.motherName);
        System.out.println("Address: " + this.address);
        System.out.println("Phone No: " + this.phoneNo);
        System.out.println("Email: " + this.email);
        System.out.println("Subjects: " + this.subjects);
    }

}
