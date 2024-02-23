package com.ExampleProject.Fat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExampleProject.Fat.Entity.TechnicianEntity;


public interface TechniciansRepoitory extends JpaRepository<TechnicianEntity, Integer> {
	


}
