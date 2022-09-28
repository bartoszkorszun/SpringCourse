package spring.course.one;

import java.util.ArrayList;
import java.util.Collections;

public class RandomFortuneService implements FortuneService {

	private ArrayList<String> fortuneList;
	
	private void setRandomFortune() {
		
		System.out.println("Random Fortune: inside setter method - setFortune");
		
		fortuneList = new ArrayList<>();
		
		fortuneList.add("Today is a bad day :(");
		fortuneList.add("Today is ok :|");
		fortuneList.add("Today is a great day :)");
	}
	
	@Override
	public String getFortune() {
		
		setRandomFortune();
		
		Collections.shuffle(fortuneList);
		
		return fortuneList.get(0);
	}

}
