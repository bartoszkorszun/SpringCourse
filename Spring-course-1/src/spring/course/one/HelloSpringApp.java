package spring.course.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// LOAD THE SPRING CONFIG FILE
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// RETRIEVE BEAN FROM SPRING CONTAINER
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// CALL METHODS ON THE BEAN
		System.out.println(theCoach.getDailyWorkout());
		
		// CALLING OUR NEW METHOD FOR FORTUNE
		System.out.println(theCoach.getDailyFortune());
		
		// CLOSE THE CONTEXT
		context.close();
	}

}
