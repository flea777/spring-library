package io.github.flea777.library.service;

import io.github.flea777.library.dto.UserDTO;
import io.github.flea777.library.model.entities.User;
import io.github.flea777.library.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map(user -> new UserDTO(
                        user.getName(),
                        user.getEmail()
                ))
                .collect(Collectors.toList());
    }

    public UserDTO createUser(UserDTO dto) {
        User user = new User(dto.name(), dto.email());
        User saved = userRepository.save(user);
        return new UserDTO(saved.getName(), saved.getEmail());
    }

    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }
}
