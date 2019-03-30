package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {
    //    @Autowired
//   // @Qualifier("current")
//
//    Instructors instructors;
//    Students students;
//    Classroom classroom;
//
//
//    @Test
//    public void currentCohortStudents() {
//        //Given
//        List<Student> myList = students.findAll();
//        boolean expected = myList.contains(students);
//
//        //When
//        Students actual = classroom.getStudents();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
    @Autowired
    @Qualifier("current")
    Classroom classroom;
    // @Autowired @Qualifier("students")
    Student student;
    Students students;

    //    @Autowired
//    Instructors instructors;
    @Test
    public void testCurrentCohortStudents() {
        //Given
        //List<Student> myList = students.findAll();
        List<Student> expected = students.findAll();
        int count = 0;
        for (Student s : expected) {
            Assert.assertTrue(classroom.getStudents().equals(expected.get(count++)));
        }
//        //When
//        Students actual = classroom.getStudents();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
    }
}
