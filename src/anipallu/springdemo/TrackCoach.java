package anipallu.springdemo;

public class TrackCoach implements Coach {

    public TrackCoach(){}
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run 5 KM Buddy";
    }

    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "just do it: " + fortuneService.getFortune();
    }
}
