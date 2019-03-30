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
public class TestInstructorConfig {


    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Test
    public void compareNameOfInstructors() {
        //Given list of Current Students
        List<Instructor> myList = instructors.findAll();
        String[] actualArray = new String[]{"Wilhem", "Nhu", "Kris"};
        //When
        List<String> actualList = Arrays.asList(actualArray);
        Integer count = 0;
        for (Instructor s : myList) {
            Assert.assertTrue(s.getName().equals(actualList.get(count++)));
        }
    }

    @Test
    public void compareNumberOfInstructors() {
        //Given list of Current Students
        List<Instructor> myList = instructors.findAll();
        Integer expected = 3;

        //When
        Integer actual = instructors.size();
        //Then

        Assert.assertEquals(expected, actual);
    }

    @Autowired
    //@Qualifier
     Instructors instructors1;
    @Test
    public void compareNameOfTcInstructors() {
        //Given list of Current Students
        List<Instructor> myList = instructors1.findAll();
        String[] actualArray = new String[]{"Leon",  "Dolio", "Froilan"};
        //When
        List<String> actualList = Arrays.asList(actualArray);
        Integer count = 0;
        for (Instructor s : myList) {
            Assert.assertTrue(s.getName().equals(actualList.get(count++)));
        }
    }

    @Test
    public void compareNumberOfTcInstructors() {
        //Given list of Current Students
        List<Instructor> myList = instructors1.findAll();
        Integer expected = 3;

        //When
        Integer actual = instructors1.size();
        //Then

        Assert.assertEquals(expected, actual);
    }

@Autowired
   @Qualifier("ZipCodeWilmington")
    Instructors instructors2;
    @Test
    public void compareNameOfZipCodeInstructors() {
        //Given list of Current Students
        List<Instructor> myList = instructors2.findAll();
        String[] actualArray = new String[]{"Leon","Dolio","Froilan","Wilhem","Nhu","Kris"};
        //When
        List<String> actualList = Arrays.asList(actualArray);
        Integer count = 0;
        for (Instructor s : myList) {
            Assert.assertTrue(s.getName().equals(actualList.get(count++)));
        }
    }

    @Test
    public void compareNumberOfZipCodeInstructors() {
        //Given list of Current Students
        List<Instructor> myList = instructors2.findAll();
        Integer expected = 6;

        //When
        Integer actual = instructors2.size();
        //Then

        Assert.assertEquals(expected, actual);
    }

}
