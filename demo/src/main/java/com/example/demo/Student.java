package com.example.demo;

public class Student extends Person implements Learner {

    private Double totalStudytime =0d;

    public Student(long id, String name) {

        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {

        totalStudytime =numberOfHours + totalStudytime;

    }

    public Double getTotalStudyTime(){

        return totalStudytime;
    }


}
