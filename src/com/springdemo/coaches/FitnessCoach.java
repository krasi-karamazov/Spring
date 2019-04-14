package com.springdemo.coaches;

import com.springdemo.base.Coach;

public class FitnessCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Give me 50";
    }

    @Override
    public String provideService() {
        return null;
    }
}
