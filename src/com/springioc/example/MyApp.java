package com.springioc.example;

public class MyApp {
    public static void main(String[] args){
        // Create a baseball coach object
        Coach bc = new BaseballCoach();
        // call baseball couch properties
        System.out.println(bc.getDailyWorkout());
        // Track Caoch
        Coach tc = new TrackCoach();
        System.out.println(tc.getDailyWorkout());
    }
}
