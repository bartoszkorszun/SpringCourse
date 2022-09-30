package spring.course.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// CREATE AN ARRAY OF STRINGS
	private String[] data = {
		"Happy Random Fortune Service",
		"Neutral Random Fortune Service",
		"Sad Random Fortune Service"
	};
	
	// CREATE A RANDOM NUMBER GENERATOR
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		// PICK A RANDOM STRING FROM THE ARRAY
		int index = random.nextInt(data.length);
		
		return data[index];
	}

}
