package org.example;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new EngineerStudentBuilder());
        Student student = director.createStudent();
        Director director1 = new Director(new MbaStudentBuilder());
        Student student1 = director1.createStudent();
        student.printDetails();
        student1.printDetails();

    }
}