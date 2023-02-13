package com.example.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment.entity.Book;
import com.example.assessment.model.service.BookService;

@RestController
public class BookController {
	private BookService bookservice;
	
	@Autowired
	public BookController(BookService bookservice) {
		this.bookservice=bookservice;
	}
	
	@PostMapping(value="/add")
	public void addBook(@RequestBody add){
		return bookservice.addBook(add);
		
	}

}
