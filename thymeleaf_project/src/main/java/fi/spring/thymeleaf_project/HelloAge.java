package fi.spring.thymeleaf_project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloAge {
	
	@RequestMapping("/hello")
	public String check(@RequestParam(value="name")String name, Model person, 
			@RequestParam(value ="age") int age, Model number) {
		person.addAttribute("name", name);
		number.addAttribute("age", age);
		
			return "hello";
		}
		
		
	}
	

