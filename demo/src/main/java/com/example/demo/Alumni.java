package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    Students students;
    Instructors instructors;

    @Autowired
    public Alumni(@Qualifier("previousStudents") Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp() {
        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

      //  instructor.lecture(students, numberOfHoursToTeachEachStudent));
           for(Instructor i : instructors){
               i.lecture(students , numberOfHoursToTeach);
           }
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
