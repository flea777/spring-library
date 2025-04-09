package io.github.flea777.library.model.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_reservation")
public class Reservation{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Date date;
  private String status;

  public Reservation(Date _date, String _status) {
    date = _date;
    status = _status;
  }

  public void cancel() {
    // Implementar método
  }
}
