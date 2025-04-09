package io.github.flea777.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.github.flea777.library.model.entities.BookEntity;
import io.github.flea777.library.repository.BookRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class BookService {

  private BookRepository repository;

  public List<BookEntity> findAll() {
    return repository.findAll();
  }

  public BookEntity findById(Long id) {
    return repository.findById(id)
      .orElseThrow(() -> new EntityNotFoundException("Livro não encontrado"));
  }

  public BookEntity insert(BookEntity data) {
    // Implementar método
    return null;
  }

  public BookEntity update(Long id, BookEntity newData) {
    // Implementar método
    return null;
  }

  public void delete(Long id) {
    // Implementar método
  }

}
