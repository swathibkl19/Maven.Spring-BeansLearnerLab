package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("currentStudent")
    Students students;


    //@RunWith
    @Test
    public void compareNameOfStudents() {
        //Given list of Current Students
        List<Student> myList = students.findAll();
        String[] actualArray = new String[]{"Arcelia", "Ajah",
                "Alex", "Ashley B.", "Ashley S.", "Aswathy", "Brian",
                "Cara", "Charles", "Cristina", "David", "Davis", "Delenda",
                "Eleonor", "Eric", "Francisco", "Jim", "Joseph", "Julian",
                "Jutta", "Kat", "Kate", "Kyle", "Laxmi", "Leah", "Mark", "Marlys",
                "Marshilla", "Michael", "Neela", "Nirmala", "Reese",
                "Robyn", "Sean Green", "Sean Grey", "Shuchi", "Sravani",
                "Sunhyun", "Swampna", "Swathi", "William", "Yang", "Zaina"};
        //When
        List<String> actualList = Arrays.asList(actualArray);
        Integer count = 0;
        for (Student s : myList) {
            Assert.assertTrue(s.getName().equals(actualList.get(count++)));
        }
    }

    @Test
    public void compareNumberOfStudents() {
        //Given list of Current Students
        List<Student> myList = students.findAll();
        Integer expected = 43;

        //When
        Integer actual = students.size();
        //Then

        Assert.assertEquals(expected, actual);
    }


    @Autowired
    @Qualifier("previousStudents")
    Students students1;
    @Test
    public void compareNameOfPrviousStudents() {
        //Given list of Current Students
        List<Student> myList = students1.findAll();
        String[] actualArray = new String[]{"Swathi", "Francisco", "Sravani", "Elenor"};
        //When
        List<String> actualList = Arrays.asList(actualArray);
        Integer count = 0;
        for (Student s : myList) {
            Assert.assertTrue(s.getName().equals(actualList.get(count++)));
        }
    }

    @Test
    public void compareNumberOfPreviousStudents() {
        //Given list of Current Students
        List<Student> myList = students1.findAll();
        Integer expected = 4;

        //When
        Integer actual = students1.size();
        //Then

        Assert.assertEquals(expected, actual);
    }

}
