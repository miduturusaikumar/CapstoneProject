package com.ExampleProject.Fat.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ExampleProject.Fat.Payload.CustomerDTO;
import com.ExampleProject.Fat.Service.CustomerService;

@Controller
@RequestMapping("api/auth")
public class CustomerAuth {
	
	@Autowired
	private CustomerService customerService;
	
	//POST method to Store in DB
	
	@PostMapping("/register")
	public ResponseEntity<CustomerDTO> createUser(@RequestBody CustomerDTO customerDTO)
	{
	       return new ResponseEntity<>(customerService.createCustomer(customerDTO),HttpStatus.CREATED);
	}
	
	

}
