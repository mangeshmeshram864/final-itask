package com.yt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Home {
	 
	@RequestMapping("/welcome")
	public String Welcome()
	{
		String text="this is prvate paeg ";
		
		return text;
	}
	@RequestMapping("/getusers")
	public String getUser()
	{
		String text="this is user page ";
		
		return text;
	}
	

	

}
