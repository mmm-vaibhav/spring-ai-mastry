package com.learning.springaimastery.phase0.users.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springaimastery.phase0.users.domain.User;

public interface UserRepository extends JpaRepository<User, Serializable>{

}
