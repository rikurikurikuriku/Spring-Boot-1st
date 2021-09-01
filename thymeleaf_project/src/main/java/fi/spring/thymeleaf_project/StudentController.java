package fi.spring.thymeleaf_project;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.Student;

@Controller
public class StudentController {
	
	ArrayList<Student> studentlist = new ArrayList<Student>();
	
	Student student1 = new Student("Kate", "Cole");
	Student student2 = new Student("Dan", "Brown");
	Student student3 = new Student("Mike", "Mars");
	
	

	@RequestMapping(value = "/studentlist", method = RequestMethod.GET)
	public String displayStudents(Model model) {
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		model.addAttribute("studentlist", studentlist);
		return "studentlist";
	}

}
