package com.demo.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class SillyController {
	@RequestMapping("/show")
	public String showMethod(){
		return "show";
	}
}
