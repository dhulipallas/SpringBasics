package com.springioc.example;

public class BaseballCoach implements Coach{

    private FortuneService myFortuneService;

    BaseballCoach(){

    }

    public BaseballCoach(FortuneService fortuneService){
        myFortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Play Baseball hard";
    }

    @Override
    public String getDailyFortune() {
        return myFortuneService.getFortune();
    }
}
