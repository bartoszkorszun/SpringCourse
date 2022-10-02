package spring.course.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		// CREATE A STUDENT OBJECT
		Student theStudent = new Student();
		
		// ADD STUDENT OBJECT TO THE MODEL
		model.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {

		// LOG THE INPUT DATA
		System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
		
		return "student-confirmation";
	}
}
