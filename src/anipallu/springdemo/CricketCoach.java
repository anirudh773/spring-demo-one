package anipallu.springdemo;

public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("CricketCoach inside no argument constructor");
    }

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside set email address ");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("inside set team ");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach inside the setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Face the Slow bowl.Try to hit the bowl..";
    }

    @Override
    public String getDailyFortune() {
        return "Sachin is god of cricket so worship him"+fortuneService.getFortune();
    }
}
