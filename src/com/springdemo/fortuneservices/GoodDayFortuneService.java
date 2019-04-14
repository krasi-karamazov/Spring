package com.springdemo.fortuneservices;

public class GoodDayFortuneService implements FortuneService {
    @Override
    public String provideFortune() {
        return "I boid you a good day";
    }
}
