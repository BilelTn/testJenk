package com.example.testjenkins.controller;


import com.example.testjenkins.entity.User;
import com.example.testjenkins.repo.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserControllerTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllUsers() {
        // Setup
        User user1 = new User();
        user1.setId(1L);
        user1.setUsername("user1");
        user1.setEmail("user1@example.com");

        User user2 = new User();
        user2.setId(2L);
        user2.setUsername("user2");
        user2.setEmail("user2@example.com");

        List<User> userList = Arrays.asList(user1, user2);
        when(userRepository.findAll()).thenReturn(userList);

        // Execute
        List<User> result = userController.getAllUsers();

        // Verify
        assertEquals(2, result.size());
    }

    @Test
    void testGetUserById() {
        // Setup
        Long userId = 1L;
        User user = new User();
        user.setId(userId);
        user.setUsername("user1");
        user.setEmail("user1@example.com");
        when(userRepository.findById(userId)).thenReturn(Optional.of(user));

        // Execute
        User result = userController.getUserById(userId);

        // Verify
        assertEquals(user, result);
    }

    // Similar tests can be written for other methods like createUser, updateUser, and deleteUser
}
