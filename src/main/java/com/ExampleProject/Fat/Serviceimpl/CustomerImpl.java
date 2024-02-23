package com.ExampleProject.Fat.Serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExampleProject.Fat.Entity.CustomerEntity;
import com.ExampleProject.Fat.Payload.CustomerDTO;
import com.ExampleProject.Fat.Repository.CustomerRepository;
import com.ExampleProject.Fat.Service.CustomerService;

@Service
public class CustomerImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public CustomerDTO createCustomer(CustomerDTO customerDTO) {
		
		//customerDTO is not an Entity We convert CustomerDto to Entity
		
		CustomerEntity customerEntity=customerDtoToEntity(customerDTO); //converted CustomerDto to Customers
		CustomerEntity savedCustomer=customerRepository.save(customerEntity);
		return entityToCustomerDto(savedCustomer);
	}

	private CustomerEntity customerDtoToEntity(CustomerDTO customerDTO) {
		CustomerEntity obj=new CustomerEntity();
		
		obj.setFirst_name(customerDTO.getFirstname());
		obj.setSecond_name(customerDTO.getSecondname());
		obj.setEmail(customerDTO.getEmail());
		obj.setMobile_number(customerDTO.getMobilenumber());
		obj.setAadhar_number(customerDTO.getAadharnumber());
		obj.setCity(customerDTO.getCity());
		obj.setState(customerDTO.getState());
		obj.setPincode(customerDTO.getPincode());
		obj.setPassword(customerDTO.getPassword());
		
		return obj;
	}
	
	
	private CustomerDTO entityToCustomerDto(CustomerEntity customerEntity)
	{
		CustomerDTO customer=new CustomerDTO();
		
		customer.setId(customerEntity.getId());
		customer.setFirstname(customerEntity.getFirstname());
		customer.setSecondname(customerEntity.getSecondname());
		customer.setEmail(customerEntity.getEmail());
		customer.setMobilenumber(customerEntity.getMobilenumber());
		customer.setAadharnumber(customerEntity.getAadharnumber());
		customer.setPassword(customerEntity.getPassword());
		customer.setCity(customerEntity.getCity());
		customer.setPincode(customerEntity.getPincode());
		customer.setState(customerEntity.getState());
		
		return customer;
	}

}
