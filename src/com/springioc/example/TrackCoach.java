package com.springioc.example;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    TrackCoach(){
    }

    public TrackCoach(FortuneService fortuneService ){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run 5k";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
