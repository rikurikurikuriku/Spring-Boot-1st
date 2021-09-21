package fi.spring.bookstore.Bookstore;

import org.springframework.boot. CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import fi.spring.bookstore.Bookstore.domain.Book;
import fi.spring.bookstore.Bookstore.domain.BookRepository;
import fi.spring.bookstore.Bookstore.domain.Category;
import fi.spring.bookstore.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(CategoryRepository repository1, BookRepository repository) {
	return (args) -> {
		
		repository1.save(new Category("Fiction"));
		repository1.save(new Category("Non-Fiction"));
		
		repository.save(new Book(1, "The Old Man and The Sea", "Ernest Hemingway", 1934, 1111, 19.90, repository1.findByName("Fiction").get(0)));	
		repository.save(new Book(1, "Testbook", "Some Dude", 2021, 1234, 10.00, repository1.findByName("Fiction").get(0)));
	};
	}
	
}
