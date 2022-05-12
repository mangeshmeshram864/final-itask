package com.yt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yt.model.CustomeUserdetails;
import com.yt.repository.UserRepo;


@Service
public class customUserDetailService implements UserDetailsService{

  
  
	@Autowired
	private UserRepo userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		
		
	      com.yt.model.User user = this.userRepository.findByUsername(userName);
		
		if (user==null)
		{
			throw new UsernameNotFoundException("User not found !!");
		}
		else
		{
			return new CustomeUserdetails(user);
		}
//		if(userName.equals("Mangesh"))
//		{
//			return new User("Mangesh", "Mangesh1234", new ArrayList<>());
//		}else
//			
//		{
//			throw new UsernameNotFoundException("User Not Found");
//		}
//		
		
		
		
	}

}
