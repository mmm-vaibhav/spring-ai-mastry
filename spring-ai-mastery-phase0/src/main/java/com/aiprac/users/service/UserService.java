package com.aiprac.users.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aiprac.users.domain.User;
import com.aiprac.users.repo.UserRepository;

import lombok.RequiredArgsConstructor;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	
	public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
