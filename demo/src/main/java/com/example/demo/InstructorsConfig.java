package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Configuration
public class InstructorsConfig {

    @Bean(name ="instructors")
    public Instructors tcUsaInstructors() {
        String[] instructorNames = {"Wilhem", "Nhu", "Kris"};

        return inputInstructors(instructorNames);
    }

        public Instructors inputInstructors(String[] instructorNames){
        Instructor[] instructorArray = new Instructor[instructorNames.length];
        for (int i = 0; i < instructorNames.length; i++) {
            String instructorName = instructorNames[i];
            instructorArray[i] = new Instructor(i, instructorName);
        }
        return new Instructors(Arrays.asList(instructorArray));
    }

    @Bean
    public Instructors tcUkInstructors() {
        String[] instructorNames = {"Leon",  "Dolio", "Froilan"};
//        Instructor[] instructorArray = new Instructor[instructorNames.length];
//        for (int i = 0; i < instructorNames.length; i++) {
//            String instructorName = instructorNames[i];
//            instructorArray[i] = new Instructor(i, instructorName);
//        }
//       return new Instructors(Arrays.asList(instructorArray));
        return inputInstructors(instructorNames);
    }

    @Primary
    @Bean(name ="ZipCodeWilmington")
    public Instructors ZipCodeWilmington() {
        String [] instructorNames ={"Leon","Dolio","Froilan","Wilhem","Nhu","Kris"};
        return inputInstructors(instructorNames);
    }
}
