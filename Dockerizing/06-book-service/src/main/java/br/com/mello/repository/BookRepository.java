package br.com.mello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mello.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}
