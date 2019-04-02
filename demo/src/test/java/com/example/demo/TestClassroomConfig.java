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

    @Autowired
    @Qualifier("current")
    Classroom classroom;
    @Autowired
    @Qualifier("previous")
    Classroom previousClassroom;
     @Autowired
     //@Qualifier("students")
    //Student student;
    Students students;

    //    @Autowired
//    Instructors instructors;
    @Test
    public void testCurrentCohortStudents() {
        //Given
        //List<Student> myList = students.findAll();
        List<Student> expected = students.findAll();
        //int count = 0;
        Assert.assertEquals(expected, classroom.getStudents().findAll());

    }
    @Test
    public void testPreviousStudents(){

        Integer expected = 4;

        Assert.assertEquals(expected, previousClassroom.getStudents().size());
    }

    @Test

    public void testCurrentLectures(){

        Integer expected = 6;
        Assert.assertEquals(expected,classroom.getInstructors().size());
    }
@Test
    public void testPreviousLectures(){
        Integer expected =3;
        Assert.assertEquals(expected,previousClassroom.getInstructors().size());
}
}
