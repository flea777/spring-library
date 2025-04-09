package io.github.flea777.library.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.flea777.library.dto.BookCreateDTO;
import io.github.flea777.library.dto.BookDTO;
import io.github.flea777.library.service.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/books")
public class BookController {

  @Autowired
  private BookService service;

  @GetMapping()
  public List<BookDTO> findAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public BookDTO findById(@PathVariable Long id) {
    return service.findById(id);
  }

  @PostMapping()
  public BookDTO insert(@RequestBody BookCreateDTO dto) {
      return service.insert(dto);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
