package com.demo.springMVC;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController { 
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmer);
	}

	@RequestMapping("/details")
	public String showCustomerfOrm(Model model){
		
		model.addAttribute("customer", new Customer());
		return "customer";
	}
	@RequestMapping("/processdata")
	public String customerProcess(@Valid @ModelAttribute("customer") Customer thecustomer, BindingResult theBindResult){
		System.out.println("LastName |"+thecustomer.getLastName() +"|");
		System.out.println(thecustomer.getPostalCode());
	if(theBindResult.hasErrors()){
		return "customer";
		
	}else{
		return "customer-confirmation";
	}
		
		
	}
}
