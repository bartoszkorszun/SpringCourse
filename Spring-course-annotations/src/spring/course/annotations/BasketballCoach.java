package spring.course.annotations;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Score 100 buckets";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
