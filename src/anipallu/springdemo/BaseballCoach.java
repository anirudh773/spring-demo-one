package anipallu.springdemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theFortuneService){
            fortuneService=theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Spend 30 working out buddy...";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
