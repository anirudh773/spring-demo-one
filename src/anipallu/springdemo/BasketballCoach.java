package anipallu.springdemo;

public class BasketballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Sprint kar bhai aur white mark show ho rha hai tere ko....???";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
