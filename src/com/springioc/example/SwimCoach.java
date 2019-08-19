package com.springioc.example;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;
    private String email;
    private String team;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    SwimCoach(){
        System.out.println("Default Constructor");
    }
    // Test for spring setter injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the setter methog");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 1000 meter laps";
    }

    @Override
    public String getDailyFortune() {
        return "Its going to rain get umbrella";
    }
}

