package io.github.flea777.library.model.entities;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Loan {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Date loanDate;
  private Date dueDate;
  private Date returnedDate;

  public Loan(Date _loanDate, Date _dueDate, Date _returnedDate) {
    loanDate = _loanDate;
    dueDate = _dueDate;
    returnedDate = _returnedDate;
  }

  public void returnBook(){
    // Implementar método
  }
}
