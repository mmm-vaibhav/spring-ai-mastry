package com.aiprac.users.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiprac.users.domain.User;

public interface UserRepository extends JpaRepository<User, Serializable>{

}
