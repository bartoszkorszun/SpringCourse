package spring.course.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// READ THE SPRING CONFIG JAVA CLASS
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// GET THE BEAN FROM THE SPRING CONAINER
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// CALL A METHOD ON THE BEAN
		System.out.println(theCoach.getDailyWorkout());
		
		// CALL A METHOD TO GET DAILY FORTUNE
		System.out.println(theCoach.getDailyFortune());
		
		// CLOSE THE CONTEXT
		context.close();
	}

}
