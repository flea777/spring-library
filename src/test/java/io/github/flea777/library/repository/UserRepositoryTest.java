package io.github.flea777.library.repository;

import io.github.flea777.library.dto.UserDTO;
import io.github.flea777.library.model.entities.User;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.util.Optional;

@DataJpaTest
@ActiveProfiles("test")
class UserRepositoryTest {

    @Autowired
    EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    void findByEmail() {
        UserDTO dto = new UserDTO("João Silva", "joao@email.com");
        User user = new User(dto.name(), dto.email());
        userRepository.save(user);

        Optional<User> resultado = userRepository.findByEmail("joao@email.com");

        assertThat(resultado).isPresent();
        assertThat(resultado.get().getName()).isEqualTo("João Silva");
    }
}