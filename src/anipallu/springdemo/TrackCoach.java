package anipallu.springdemo;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 5 KM Buddy";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
