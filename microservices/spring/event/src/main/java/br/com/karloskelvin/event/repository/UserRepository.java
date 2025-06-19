package br.com.karloskelvin.event.repository;

import br.com.karloskelvin.event.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ListCrudRepository<User, Integer> {
    Optional<User> findByUserId(Integer userId);
    Optional<User> findByEmail(String email);
}
