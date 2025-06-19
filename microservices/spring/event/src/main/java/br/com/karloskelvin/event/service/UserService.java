package br.com.karloskelvin.event.service;

import br.com.karloskelvin.event.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User findByUserId(User user);
    User findByEmail(String email);
    List<User> findAll();
}
