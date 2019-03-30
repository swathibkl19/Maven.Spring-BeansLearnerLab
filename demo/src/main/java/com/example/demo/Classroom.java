package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Classroom {
    private final Instructors instructors;
    private Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    /**
     * The class should define a method hostLecture which makes use of a Teacher teacher,
     * double numberOfHours parameter to host a lecture to the composite personList field in the students reference.
     * @param teacher
     * @param numberOfHours
     */
    public void hostLecture(Teacher teacher , Double numberOfHours){
        teacher.lecture(students, numberOfHours);

    }


}
