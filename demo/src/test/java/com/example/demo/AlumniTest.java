package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    Students students;
    @Autowired
    Instructors instructors;
    @Autowired
    Alumni alumni;

    @Test
    public void testNumberOfHoursStudentsHad() {

        double expected = 1200;

        for (int i = 0; i < students.size(); i++) {
                Assert.assertEquals(expected , students.personList.get(i).getTotalStudyTime(), 0.01);

            }
        }
       // Assert.assertEquals(expected , 1200);



    @Test
    public void testNumberOfHoursTaught(){

        int expected =9600;

        alumni.executeBootcamp();

        for (int i = 0; i < instructors.size() ; i++) {

            Assert.assertEquals(expected,instructors.personList.get(i).getHoursTaught(),0.0);

        }
    }

}