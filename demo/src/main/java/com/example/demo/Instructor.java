package com.example.demo;

import java.util.List;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {

    }

    @Override
    public void lecture() {

    }

    }

