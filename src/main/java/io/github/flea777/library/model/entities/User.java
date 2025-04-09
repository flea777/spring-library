package io.github.flea777.library.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String email;

  public User(String _name, String _email) {
    name = _name;
    email = _email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public Reservation reserveBook(Book book) {
    return null;
  }

  public Loan borrowBook(Book book) {
    return null;
  }
}
