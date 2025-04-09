package io.github.flea777.library.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.flea777.library.model.entities.BookEntity;
import io.github.flea777.library.service.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/books")
public class BookController {

  @Autowired
  private BookService service;

  @GetMapping()
  public List<BookEntity> findAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public BookEntity findById(@PathVariable Long id) {
    return service.findById(id);
  }

  @PostMapping()
  public BookEntity insert(@RequestBody BookEntity data) {
      return service.insert(data);
  }

  @PutMapping("/{id}")
  public BookEntity update(@PathVariable Long id, @RequestBody BookEntity newData) {
      return service.update(id, newData);
  }

  @DeleteMapping
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
