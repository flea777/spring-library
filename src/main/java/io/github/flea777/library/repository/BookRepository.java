package io.github.flea777.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.flea777.library.model.entities.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long>{

}
