package spring.course.one;

public class MyApp {

	public static void main(String[] args) {
		
		// CREATING AN OBJECT
		Coach theCoach = new TrackCoach();
		
		// USING THE OBJECT
		System.out.println(theCoach.getDailyWorkout());
	}
	
}
