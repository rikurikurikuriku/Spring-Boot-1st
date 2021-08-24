package fi.spring.spring;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	
	@RequestMapping("*")
	@ResponseBody
	public String greetz() {
		return "Hi there!";
		
	
	}
	

	@RequestMapping("hi")
	@ResponseBody
	public String greetzWithName(@RequestParam(name ="firstname", required=false, defaultValue="dingus") String name) {
		return "What's up, " + name + "!";
	}

	@RequestMapping("age")
	@ResponseBody
	public String greetzWithNameAge(@RequestParam(name ="firstname", required=false, defaultValue="dingus") String name, 
			@RequestParam(name="age") int age) {
		return "What's up, " + name + "! You are " + age + " years old now!";
	}
}
