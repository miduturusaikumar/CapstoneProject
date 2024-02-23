package com.ExampleProject.Fat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ExampleProject.Fat.Payload.TechnicianDTO;

import com.ExampleProject.Fat.Service.TechnicianService;

@Controller
@RequestMapping("api/technicianauth")
public class TechnicianAuth {
	
	@Autowired
	private TechnicianService technicianService;
	
	//POST method to Store in DB
	
	@PostMapping("/register")
	public ResponseEntity<TechnicianDTO> createUser(@RequestBody TechnicianDTO technicianDTO)
	{
	       return new ResponseEntity<>(technicianService.createTechnian(technicianDTO),HttpStatus.CREATED);
	}

}
