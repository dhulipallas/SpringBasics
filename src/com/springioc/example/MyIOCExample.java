package com.springioc.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
// IOC Example with XML Context
public class MyIOCExample {
    public static void main(String[] args) {
        // Load Spring Container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Retrive Bean from Container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        // Call Methods on Spring Bean
        System.out.println(theCoach.getDailyWorkout());
        // Get BaseBall Couch
        Coach bbCoach = context.getBean("myBaseballCoach", Coach.class);
        System.out.println(bbCoach.getDailyWorkout());
        // Close Container
        context.close();

    }
}
