package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;
	
	
	@GetMapping("/sayHi")
	public String sayHi()
	{
		return "Hi Ajit";
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
}
