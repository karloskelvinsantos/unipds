package br.com.karloskelvin.event.controller;

import br.com.karloskelvin.event.model.User;
import br.com.karloskelvin.event.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.status(201).body(userService.addUser(user));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> findByUserId(@PathVariable Integer userId) {
        var user = new User();
        user.setUserId(userId);
        return ResponseEntity.ok(userService.findByUserId(user));
    }

    @GetMapping("/email/{userEmail}")
    public ResponseEntity<User> findByEmail(@PathVariable String userEmail) {
        return ResponseEntity.ok(userService.findByEmail(userEmail));
    }

    @GetMapping()
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
