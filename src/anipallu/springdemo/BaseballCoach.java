package anipallu.springdemo;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Spend 30 working out buddy...";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
