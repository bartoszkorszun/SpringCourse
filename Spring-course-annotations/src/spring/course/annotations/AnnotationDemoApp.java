package spring.course.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// READ THE SPRING CONFIG FILE
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
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
