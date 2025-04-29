package io.github.flea777.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.flea777.library.model.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
}
