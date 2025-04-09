package io.github.flea777.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.flea777.library.model.entities.Book;
import io.github.flea777.library.repository.BookRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class BookService {

  @Autowired
  private BookRepository repository;

  public List<Book> findAll() {
    return repository.findAll();
  }

  public Book findById(Long id) {
    return repository.findById(id)
      .orElseThrow(() -> new EntityNotFoundException("Livro não encontrado"));
  }

  public Book insert(Book data) {
    return repository.save(data);
  }

  public void delete(Long id) {
    // Implementar método
  }

}
