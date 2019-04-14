package com.springdemo.coaches;

import com.springdemo.base.Coach;

public class HockeyCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Hockey Training";
    }

    @Override
    public String provideService() {
        return null;
    }
}
