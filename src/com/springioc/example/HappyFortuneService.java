package com.springioc.example;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Its an Awesome Day";
    }
}
