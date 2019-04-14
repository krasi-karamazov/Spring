package com.springdemo;

import com.springdemo.base.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
        Coach c = applicationContext.getBean("baseballCoach", Coach.class);
        Coach hc = applicationContext.getBean("hocketCoach", Coach.class);
        System.out.println(c.getDailyWorkout());
    }
}
