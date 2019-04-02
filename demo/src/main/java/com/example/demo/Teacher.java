package com.example.demo;

import java.util.List;

public interface Teacher {

    public void teach(Learner learner , Double numberOfHours);

    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours);




}
