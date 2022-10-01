package spring.course.annotations;

public class BasketFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You made a perfect 3-pointer!";
	}

}
