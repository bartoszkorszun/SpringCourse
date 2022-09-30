package spring.course.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	// DEFINE A DEFAULT CONSTRUCTOR
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside the default constructor");
	}
	
	// DEFINE AN INIT METHOD
	@PostConstruct
	public void myStartupMethod() {
		System.out.println(">> TennisCoach: inside myStartupMethod");
	}
	
	// DEFINE A DESTROY METHOD
	@PreDestroy
	public void myCleanupMethod() {
		System.out.println(">> TennisCoach: inside myCleanupMethod");
	}
	
	// DEFINE A SETTER METHOD
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
