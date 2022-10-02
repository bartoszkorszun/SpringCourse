package spring.course.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BadController {

	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "bad";
	}
}
