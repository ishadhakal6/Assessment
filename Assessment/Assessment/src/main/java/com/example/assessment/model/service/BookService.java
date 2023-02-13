package com.example.assessment.model.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assessment.entity.Book;
import com.example.assessment.model.repository.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;
	
	@Autowired
	public BookService(BookRepository bookRepo) {
		this.bookRepo=bookRepo;
	}
	
	public Book addBook(Book book) {
		book.setBookcode(UUID.randomUUID().toString());
		return bookRepo.save(book);
	}
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
	public Book editBook(Book book){
		return bookRepo.save(book);
	}
	
	public List<Book> findAllBook(){
		return bookRepo.findAll();
	}
	
	
}
