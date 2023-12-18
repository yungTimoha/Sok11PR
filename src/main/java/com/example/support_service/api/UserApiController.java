package com.example.support_service.api;

import com.example.support_service.models.User;
import com.example.support_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        // Проверка существования пользователя с заданным id
        User existingUser = userService.findById(id);
        if (existingUser == null) {
            return ResponseEntity.notFound().build();
        }

        // Обновление полей пользователя
        existingUser.setUserName(updatedUser.getUserName());
        existingUser.setUserAge(updatedUser.getUserAge());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        existingUser.setRole(updatedUser.getRole());

        // Сохранение обновленного пользователя
        User updatedUserData = userService.saveUser(existingUser);
        return ResponseEntity.ok(updatedUserData);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }
}