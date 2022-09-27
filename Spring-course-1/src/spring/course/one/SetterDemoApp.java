package spring.course.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// LOAD THE SPRING CONFIG FILE
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// RETRIEVE BEAN FROM SPRING CONTAINER
		VolleyballCoach theCoach = context.getBean("myVolleyballCoach", VolleyballCoach.class);
		
		// CALL METHODS ON THE BEAN
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// CALL OUT OUR NEW METHODS TO GET LITERAL VALUES
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		// CLOSE THE CONTEXT
		context.close();
	}

}
