package io.github.flea777.library.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.flea777.library.dto.BookCreateDTO;
import io.github.flea777.library.dto.BookDTO;
import io.github.flea777.library.model.entities.Book;
import io.github.flea777.library.repository.BookRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class BookService {

  @Autowired
  private BookRepository repository;

  public List<BookDTO> findAll() {
    return repository.findAll()
        .stream()
        .map(b -> new BookDTO(
            b.getName(),
            b.getIsbn(),
            b.getAuthor(),
            b.getPublisher(),
            b.isAvailable()
        ))
        .collect(Collectors.toList());
}


  public BookDTO findById(Long id) {
    var entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    return new BookDTO(
     entity.getName(),
     entity.getIsbn(),
     entity.getAuthor(),
     entity.getPublisher(),
     entity.isAvailable()
     );
  }

  public BookDTO insert(BookCreateDTO dto) {
    var entity = repository.save(new Book(dto));
    return new BookDTO(
      entity.getName(),
      entity.getIsbn(),
      entity.getAuthor(),
      entity.getPublisher(),
      entity.isAvailable()
    );
  }


 public void delete(Long id) {
    if(!repository.existsById(id)) {
      throw new EntityNotFoundException("Livro não encontrado");
    }
    repository.deleteById(id);
  }

}
