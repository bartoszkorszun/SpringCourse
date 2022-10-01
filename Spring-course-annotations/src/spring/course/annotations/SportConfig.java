package spring.course.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("spring.course.annotations")
@PropertySource("classpath:more.sport.properties")
public class SportConfig {

	// DEFINE A BEAN FOR SAD FORTUNE SERVICE
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// DEFINE A BEAN FOR SWIM COACH AND INJECT DEPENDENCY
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
