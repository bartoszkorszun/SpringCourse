package spring.course.one;

public class VolleyballCoach implements Coach{

	private FortuneService fortuneService;
	
	// ADDING NEW FIELDS FOR E-MAIL AND TEAM
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Volleyball Coach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Volleyball Coach: inside setter method - setTeam");
		this.team = team;
	}

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
