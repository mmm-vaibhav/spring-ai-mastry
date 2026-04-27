package com.learning.springaimastery.phase0.users.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.springaimastery.phase0.users.domain.User;
import com.learning.springaimastery.phase0.users.repo.UserRepository;
import com.learning.springaimastery.phase0.users.web.dto.UserDTO;

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
    public User createUser(UserDTO userdto) {
    	User user = new User();
    	user.setName(userdto.name());
    	user.setEmail(userdto.email());
        return userRepository.save(user);
    }

}
