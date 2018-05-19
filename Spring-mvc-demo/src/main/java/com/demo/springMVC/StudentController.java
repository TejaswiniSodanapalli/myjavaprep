package com.demo.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showStudent")
	public String studentDetails(Model model){
		//Create student class
		StudentDAO thestudent = new StudentDAO();
		//map student to model
		model.addAttribute("student",thestudent);
		
		return "student_Form";
	}
	@RequestMapping("/processdata")
	public String studentCofirm(@ModelAttribute("student") StudentDAO thestudent){
		System.out.println(thestudent.getStudentFirstName()+thestudent.getStudentLastName());
		System.out.println(thestudent.getCountry());
		System.out.println(thestudent.getFavLanguage());
		System.out.println(thestudent.getOperatingSystem());
		return "student_confirm";
	}
	@RequestMapping("/StudentRadio")
	public String studentRadio(Model model){
		//Create student class
		StudentDAO thestudent = new StudentDAO();
		//map student to model
		model.addAttribute("student",thestudent);
		
		return "RadioButtons";
	}
}
