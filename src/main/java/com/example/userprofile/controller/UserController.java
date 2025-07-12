package com.example.userprofile.controller;

import com.example.userprofile.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Controller for managing user-related operations.
 * Provides endpoints for adding, retrieving, and listing users.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final Map<String, User> userDb = new HashMap<>();

    @Value("${user.max.count}")
    private int maxUsers;

    @Value("${user.default.country}")
    private String defaultCountry;

    /**
     * Adds a new user to the database.
     *
     * @param user the user object to be added
     * @return a confirmation message
     */
    @PostMapping
    public String addUser(@RequestBody User user) {
        if (userDb.size() >= maxUsers) {
            return "User limit reached. Cannot add more users.";
        }

        // Set default country if not provided
        if (user.getCountry() == null || user.getCountry().isEmpty()) {
            user.setCountry(defaultCountry);
        }

        userDb.put(user.getId(), user);
        return "User added.";
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param id the unique identifier of the user
     * @return the user object if found, otherwise null
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userDb.getOrDefault(id, null);
    }

    /**
     * Retrieves all users in the database.
     *
     * @return a collection of all user objects
     */
    @GetMapping
    public Collection<User> getAllUsers() {
        return userDb.values();
    }
}