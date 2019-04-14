package com.springdemo.coaches;

import com.springdemo.base.Coach;
import com.springdemo.fortuneservices.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball training";
    }

    @Override
    public String provideService() {
        return fortuneService.provideFortune();
    }
}
