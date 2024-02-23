package com.ExampleProject.Fat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExampleProject.Fat.Entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
	
	

}
