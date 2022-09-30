package spring.course.annotations;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	@Value("${file.fortune.one}")
	private String fileFortuneOne;
	@Value("${file.fortune.two}")
	private String fileFortuneTwo;
	@Value("${file.fortune.three}")
	private String fileFortuneThree;
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
		String[] data = {
				fileFortuneOne,
				fileFortuneTwo,
				fileFortuneThree
		};
		
		int index = random.nextInt(data.length);
		
		return data[index];
	}

}
