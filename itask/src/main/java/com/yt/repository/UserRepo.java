package com.yt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.yt.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
 
	public User findByUsername(String username);
	
}
