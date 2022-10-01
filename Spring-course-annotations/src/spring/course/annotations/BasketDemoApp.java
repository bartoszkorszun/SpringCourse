package spring.course.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasketDemoApp {

	public static void main(String[] args) {
		
		// READ THE SPRING CONFIG JAVA CLASS
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BasketConfig.class);
		
		// GET THE BEAN FROM THE SPRING CONAINER
		BasketballCoach theCoach = context.getBean("basketballCoach", BasketballCoach.class);
		
		// CALL A METHOD ON THE BEAN
		System.out.println(theCoach.getDailyWorkout());
		
		// CALL A METHOD TO GET DAILY FORTUNE
		System.out.println(theCoach.getDailyFortune());
		
		// CLOSE CONTEXT
		context.close();
	}

}
