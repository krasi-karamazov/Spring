package com.springdemo;

import com.springdemo.base.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        //Load the config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        //get bean from container
        Coach c1 = context.getBean("cricketCoach", Coach.class);
        //call methods of the bean
        System.out.println(c1.getDailyWorkout());
        System.out.println(c1.provideService());

        //close app context
        context.close();
    }
}
