package org.example;

import java.util.ArrayList;
import java.util.List;

public class MbaStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = new ArrayList<>();
        for (String subject: subjects) {
            if (subject.equals("English") || subject.equals("Economics") || subject.equals("Business")) {
                this.subjects.add(subject);
            }
        }
        return this;
    }
}
