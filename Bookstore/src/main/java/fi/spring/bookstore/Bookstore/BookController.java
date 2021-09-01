package fi.spring.bookstore.Bookstore;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.Book;


public class BookController {
	
	ArrayList<Book> books = new ArrayList<Book>();
	

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String allBooks(Model model) {
		model.addAttribute("books", books);
		return "index";
	}
}
