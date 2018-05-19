package com.demo.springMVC;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultipleRequestMapping {

	@RequestMapping("/show")
	public String showMethod(){
		return "show";
	}
	/*@RequestMapping("/process")//only used views
	public String processMethod(){
		return "process";
	}*/
	@RequestMapping("/processName")//model and views
	public String processMethod(HttpServletRequest request, Model model){
		String name = request.getParameter("studentName");
		String upperName = name.toUpperCase();
		System.out.println(upperName);
		model.addAttribute("mesaage", upperName);
		
		return "process";
	}
	@RequestMapping("/processNameRequestParam")//model and views
	public String processMethodRequestParam(@RequestParam("studentName") String theName, Model model){
		String upperName = theName.toLowerCase();
		System.out.println(upperName);
		model.addAttribute("mesaage", upperName);
		
		return "process";
	}
	
}
