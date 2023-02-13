package com.example.assessment.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.assessment.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	@Query(value = "select b from Book b where b.id=:id")
	Optional<Book> validateBookById(Long id);
	
	
}
