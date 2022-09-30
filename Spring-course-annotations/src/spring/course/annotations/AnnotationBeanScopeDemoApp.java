package spring.course.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// LOAD SPRING CONFIG FILE
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// RETRIEVE BEAN FROM THE SPRING CONTAINER
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// CHECK IF THEY ARE THE SAME
		boolean result = (theCoach == alphaCoach);
		
		// PRINTING THE RESULT 
		System.out.println("\n>>Pointing to the same object: " + result);
		
		System.out.println("\n>>Memoty location of theCoach: " + theCoach);
		
		System.out.println("\n>>Memoty location of alphaCoach: " + alphaCoach);
		
		// CALL A METHOD ON THE BEAN
		System.out.println(theCoach.getDailyFortune());
		
		// CLOSE THE CONTEXT
		context.close();
	}

}
