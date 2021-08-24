package fi.spring.spring;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class First {

	
	@RequestMapping("index")
	@ResponseBody
	public String mainpage() {
		return "This is the main page!";
		
	
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contactpage() {
		return "This is the contact page!";
		
	
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String greetinwithlocation(@RequestParam(name ="firstname", required=false, defaultValue="dingus") String name,
			@RequestParam(name ="location", required=false, defaultValue="dingus") String location) {
		return "Welcome to the " + location + ", " + name + "!";
	}

}
