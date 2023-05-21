package org.example;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = new ArrayList<>();
        for (String subject: subjects) {
            if (subject.equals("Maths") || subject.equals("Physics") || subject.equals("Chemistry")) {
                this.subjects.add(subject);
            }
        }
        return this;
    }
}
