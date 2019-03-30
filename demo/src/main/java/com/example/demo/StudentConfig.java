package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Configuration
public class StudentConfig {

    // @Autowired

//    private Students students;


        @Primary
        @Bean("currentStudent")
        public Students currentStudents () {

            String[] studentNames = {"Arcelia", "Ajah",
                    "Alex", "Ashley B.", "Ashley S.", "Aswathy", "Brian",
                    "Cara", "Charles", "Cristina", "David", "Davis", "Delenda",
                    "Eleonor", "Eric", "Francisco", "Jim", "Joseph", "Julian",
                    "Jutta", "Kat", "Kate", "Kyle", "Laxmi", "Leah", "Mark", "Marlys",
                    "Marshilla", "Michael", "Neela", "Nirmala", "Reese",
                    "Robyn", "Sean Green", "Sean Grey", "Shuchi", "Sravani",
                    "Sunhyun", "Swampna", "Swathi", "William", "Yang", "Zaina"};
            return inputStudents(studentNames);

        }

        @Bean("previousStudents")
        public Students previousStudents () {
            String[] studentNames = {"Swathi", "Francisco", "Sravani", "Elenor"};
            System.out.println(inputStudents(studentNames));
            return inputStudents(studentNames);
        }

        public Students inputStudents (String[]studentsNames){
            Student[] studentArray = new Student[studentsNames.length];
            for (int i = 0; i < studentsNames.length; i++) {
                String studentName = studentsNames[i];
                studentArray[i] = new Student(i, studentName);
            }
            return new Students(Arrays.asList(studentArray));
        }
    }
