package com.springioc.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SwimCoach swimCoach = context.getBean("mySwimCoach", SwimCoach.class);
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        // Access Set Values
        System.out.println(swimCoach.getTeam());
        System.out.println(swimCoach.getEmail());
        // get the properties file value
        System.out.println(swimCoach.getPhone());
        context.close();

    }
}
