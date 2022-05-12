package com.yt;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.web.header.writers.frameoptions.StaticAllowFromStrategy;

import com.yt.model.User;
import com.yt.repository.UserRepo;

@SpringBootApplication
public class ItaskApplication implements CommandLineRunner {

	
	@Autowired
	private UserRepo userRepository;
	public void createUser()
	{
User user=new User();
		
		Long id=new Long(random.nextInt(100));
		user.setId(id);
		user.setEmail("user"+id+"@gmail.com");
		user.setPassword("user"+id);
		user.setRole("Admin");
		user.setUsername("user"+id);
		
		User save = userRepository.save(user);
		System.out.println(save);
	}
	
	static Random random=new Random();
	public static void main(String[] args) {
		SpringApplication.run(ItaskApplication.class, args);
		
		
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		createUser();
	}

}
