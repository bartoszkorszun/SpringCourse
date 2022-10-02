package spring.course.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// NEED A CONTROLLER METHOD TO SHOW THE INITIAL HTML FORM
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// NEED A CONTROLLER METHOD TO PROCESS THE HTML FORM
	@RequestMapping("/processFormVersion1")
	public String processForm() {
		return "helloworld";
	}
	
	// NEW CONTROLLER METHOD TO READ FORM DATA NAD ADD DATA TO THE MODEL
	@RequestMapping("/processFormVersion2")
	public String modelData1(HttpServletRequest request, Model model) {
		
		// READ THE REQUEST PARAMETER FROM THE HTML FORM
		String theName = request.getParameter("studentName");
		
		// CONVERT THE DATA TO ALL CAPS
		theName = theName.toUpperCase();
		
		// CREATE A MESSAGE
		String result = "HI! " + theName;
		
		// ADD MESSAGE TO THE MODEL
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion3")
	public String modelData2(@RequestParam("studentName") String theName, Model model) {
		
		// CONVERT THE DATA TO ALL CAPS
		theName = theName.toUpperCase();
		
		// CREATE A MESSAGE
		String result = "HELLO! " + theName;
		
		// ADD MESSAGE TO THE MODEL
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
