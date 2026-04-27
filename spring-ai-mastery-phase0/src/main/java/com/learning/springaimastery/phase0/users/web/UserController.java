package com.learning.springaimastery.phase0.users.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springaimastery.phase0.users.domain.User;
import com.learning.springaimastery.phase0.users.service.UserService;
import com.learning.springaimastery.phase0.users.web.dto.UserDTO;
import com.learning.springaimastery.phase0.util.AppConstants;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(AppConstants.BASE_URL)
public class UserController {
	
	
	private final UserService userService;
	
	@GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
	
	@PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody UserDTO user) {
        User saved = userService.createUser(user);
        return ResponseEntity.ok(saved);
    }
	
	

}
