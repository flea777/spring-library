package io.github.flea777.library.model.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String isbn;
  private String author;
  private String publisher;
  private Boolean isAvailable;

  public Book(String _name, String _isbn, String _author, String _publisher) {
    name = _name;
    isbn = _isbn;
    author = _author;
    publisher = _publisher;
    isAvailable = true;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getAuthor() {
    return author;
  }

  public String getPublisher() {
    return publisher;
  }

  public Boolean isAvailable() {
    return isAvailable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book)) return false;
    Book that = (Book) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
