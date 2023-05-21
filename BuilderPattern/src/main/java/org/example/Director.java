package org.example;

import java.util.List;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if (studentBuilder instanceof EngineerStudentBuilder) {
            return studentBuilder
                    .setName("John")
                    .setFatherName("John's Father")
                    .setMotherName("John's Mother")
                    .setAddress("John's Address")
                    .setPhoneNo("John's Phone Number")
                    .setEmail("John's Email")
                    .setSubjects(List.of("Maths", "Physics", "Chemistry"))
                    .build();
        }
        else if (studentBuilder instanceof MbaStudentBuilder) {
            return studentBuilder
                    .setName("John")
                    .setFatherName("John's Father")
                    .setMotherName("John's Mother")
                    .setAddress("John's Address")
                    .setPhoneNo("John's Phone Number")
                    .setEmail("John's Email")
                    .setSubjects(List.of("English", "Economics", "Business"))
                    .build();
        }
        else {
            return null;
        }
    }

}
