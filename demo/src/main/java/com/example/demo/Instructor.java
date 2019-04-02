package com.example.demo;

import java.util.Iterator;
import java.util.List;

public class Instructor extends Person implements Teacher {
    Double hoursTaught =0.0;

    public Instructor(long id, String name) {
        super(id, name);
    }

    public Double getHoursTaught() {
        return hoursTaught;
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        int count = 0;
        for (Learner learner : learners) {
            count ++;
        }
         hoursTaught += numberOfHours;
        double numberOfHoursPerLearner = numberOfHours / count;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }

        //double numberOfHoursPerLearner = numberOfHours / count;
    }


    }

