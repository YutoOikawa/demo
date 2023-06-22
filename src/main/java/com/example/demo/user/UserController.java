package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public List<User> findAllUsers() {
        List<User> users = repository.findAll();
        return users;
    }

    @PostMapping("/create/confirm")
    public void saveUser(@RequestBody User user) {
        repository.save(user);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        repository.deleteById(userId);
    }

    @PutMapping("/update/{userId}")
    public void updateUser(@PathVariable Integer userId, @RequestBody User updatedUser) {
        User existingUser = repository.findById(userId).orElse(null);
        if (existingUser != null) {
            existingUser.setName(updatedUser.getName());
            existingUser.setEmail(updatedUser.getEmail());
            repository.save(existingUser);
        }
    }

}
