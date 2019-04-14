package com.springdemo.coaches;

import com.springdemo.base.Coach;
import com.springdemo.fortuneservices.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Cricket Training";
    }

    @Override
    public String provideService() {
        return fortuneService.provideFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
