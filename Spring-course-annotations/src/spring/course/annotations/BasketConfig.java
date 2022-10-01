package spring.course.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasketConfig {

	@Bean
	public FortuneService basketFortuneService() {
		return new BasketFortuneService();
	}
	
	@Bean
	public Coach basketballCoach() {
		return new BasketballCoach(basketFortuneService());
	}
}
