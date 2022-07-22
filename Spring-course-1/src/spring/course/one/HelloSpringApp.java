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
		
		//CLOSE THE CONTEXT
		context.close();
	}

}
