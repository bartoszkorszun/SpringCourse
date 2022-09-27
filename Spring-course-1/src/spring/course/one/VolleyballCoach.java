package spring.course.one;

public class VolleyballCoach implements Coach{

	private FortuneService fortuneService;
	
	// CREATING A NO-ARG CONSTRUCTOR
	public VolleyballCoach() {
		System.out.println("Volleyball Coach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Volleyball Coach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do a 1000 squats!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
