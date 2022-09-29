package spring.course.annotations;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Do a 1000 squats";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
