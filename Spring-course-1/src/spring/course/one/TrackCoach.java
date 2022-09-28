package spring.course.one;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: " + fortuneService.getFortune();
	}

	// ADD AN INIT METHOD
	public void doMyStartupMethod() {
		System.out.println("TrackCoach: Inside the method - doMyStartupMethod");
	}
	
	// ADD A DESTROY METHOD
	public void doMyCleanupMethod() {
		System.out.println("TrackCoach: Inside the method - doMyCleanupMethod");
	}
}
