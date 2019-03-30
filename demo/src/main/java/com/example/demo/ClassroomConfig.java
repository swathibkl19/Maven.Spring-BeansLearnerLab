package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
//    private Classroom classroom;

    @Bean(name="current")
    @DependsOn({"instructors", "currentStudent"})
    public Classroom currentCohort(Instructors instructors, Students students){
        Classroom classroom = new Classroom(instructors, students);
        return classroom;
    }

    @Bean("previous")
    @DependsOn({"instructors", "currentStudent"})
    public Classroom previousCohort(Instructors instructors, Students students){
        Classroom classroom = new Classroom(instructors, students);
        return classroom;
    }
}
