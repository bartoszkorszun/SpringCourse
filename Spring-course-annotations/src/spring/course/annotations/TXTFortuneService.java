package spring.course.annotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class TXTFortuneService implements FortuneService {

	private String fileName = "src/fortuneData.txt";
	private List<String> fortunes;
	
	// CREATE A RANDOM NUMBER GENERATOR
	private Random random = new Random();
	
	public TXTFortuneService() {
		System.out.println(">> TXTFortuneService: inside default constructor");
	}
	
	@PostConstruct
	private void loadFortunesFile() {
		System.out.println(">> TXTFortuneService: inside method loadFortunesFile");
		
		File file = new File(fileName);
		
		System.out.println(">> Reading fortunes from file: " + file);
		System.out.println(">> File exists: " + file.exists());
		
		// INIT ARRAY LIST
		fortunes = new ArrayList<String>();
		
		// READ FORTUNES FROM FILE
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String tmpLine;
			while ((tmpLine = br.readLine()) != null) {
				fortunes.add(tmpLine);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		// PICK A RANDOM STRING FROM THE ARRAY
		int index = random.nextInt(fortunes.size());
		
		return fortunes.get(index);
	}

}
