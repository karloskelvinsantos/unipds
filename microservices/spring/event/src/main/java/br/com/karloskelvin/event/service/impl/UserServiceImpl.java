package br.com.karloskelvin.event.service.impl;

import br.com.karloskelvin.event.exception.NotFoundException;
import br.com.karloskelvin.event.model.User;
import br.com.karloskelvin.event.repository.UserRepository;
import br.com.karloskelvin.event.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUserId(User user) {
        return userRepository.findByUserId(user.getUserId()).orElseThrow(() -> new NotFoundException("Usuário não encontrado"));
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new NotFoundException("Usuário não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
