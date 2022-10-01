package spring.course.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// READ THE SPRING CONFIG JAVA CLASS
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// GET THE BEAN FROM THE SPRING CONAINER
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// CALL A METHOD ON THE BEAN
		System.out.println(theCoach.getDailyWorkout());
		
		// CALL A METHOD TO GET DAILY FORTUNE
		System.out.println(theCoach.getDailyFortune());
		
		// CALL OUT NEW METHODS
		System.out.println("E-mail: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
		
		// CLOSE THE CONTEXT
		context.close();
	}

}
