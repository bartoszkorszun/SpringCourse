package spring.course.one;

public class BaseballCoach implements Coach{

	//DEFINE A PRIVATE FIELD FOR DEPENDENCY
	private FortuneService fortuneService;
	
	//DEFINE A CONSTRUCTOR FOR DEPENDENCY INJECTION
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 minutes on batting practice!";
	}

	@Override
	public String getDailyFortune() {
		// USE MY FORTUNE SERVICE TO GET A FORTUNE SERVICE
		return fortuneService.getFortune();
	}
}
