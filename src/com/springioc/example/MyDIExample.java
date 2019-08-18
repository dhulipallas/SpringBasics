package com.springioc.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// IOC Example with XML Context
public class MyDIExample {
    public static void main(String[] args) {
        // Load Spring Container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Retrive Bean from Container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        // Call Methods on Spring Bean
        System.out.println(theCoach.getDailyWorkout());
        // call inject method
        System.out.println(theCoach.getDailyFortune());
        // Get BaseBall Couch
        Coach bbCoach = context.getBean("myBaseballCoach", Coach.class);
        System.out.println(bbCoach.getDailyWorkout());
        // call inject method
        System.out.println(bbCoach.getDailyFortune());
        // Close Container
        context.close();

    }
}
