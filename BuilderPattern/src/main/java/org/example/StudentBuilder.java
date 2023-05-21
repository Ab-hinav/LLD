package org.example;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class StudentBuilder {

    public Integer id;
    public String name;
    public Integer rollNo;
    public String fatherName;
    public String motherName;
    public String address;
    public String phoneNo;
    public String email;
    public List<String> subjects;

    public StudentBuilder(){
        // generate id
        this.id = new Random().nextInt(1000);
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public abstract StudentBuilder setSubjects(List<String> subjects);

    public Student build(){
        return new Student(this);
    }



}
