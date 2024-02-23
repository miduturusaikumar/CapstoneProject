package com.ExampleProject.Fat.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.ExampleProject.Fat.Entity.CustomerEntity;
import com.ExampleProject.Fat.Entity.TechnicianEntity;
//import com.ExampleProject.Fat.Payload.CustomerDTO;
import com.ExampleProject.Fat.Payload.TechnicianDTO;
import com.ExampleProject.Fat.Repository.TechniciansRepoitory;
import com.ExampleProject.Fat.Service.TechnicianService;

@Service
public class TechnicianImpl implements TechnicianService{

	@Autowired
	private TechniciansRepoitory techniciansRepoitory;
	
	@Override
	public TechnicianDTO createTechnian(TechnicianDTO technicianDTO) {
		
		//technicianDTO is not an Entity We convert TechnicianDto to Entity
		
				TechnicianEntity technicianEntity=technicianDtoToEntity(technicianDTO); //converted technicianDto to Customers
				TechnicianEntity savedTechnician=techniciansRepoitory.save(technicianEntity);
				return entityToTechnicianDto(savedTechnician);
	}

	
	private TechnicianDTO entityToTechnicianDto(TechnicianEntity savedTechnician) {
            TechnicianDTO technicainDto=new TechnicianDTO();
		
            technicainDto.setId(savedTechnician.getId());
            technicainDto.setFirstname(savedTechnician.getFirstname());
            technicainDto.setSecondname(savedTechnician.getSecondname());
            technicainDto.setEmail(savedTechnician.getEmail());
            technicainDto.setMobilenumber(savedTechnician.getMobilenumber());
            technicainDto.setAadharnumber(savedTechnician.getAadharnumber());
            technicainDto.setPassword(savedTechnician.getPassword());
		    technicainDto.setDescription(savedTechnician.getDescription());
		    
		
		return technicainDto;
		
	}

	
	private TechnicianEntity technicianDtoToEntity(TechnicianDTO technicianDTO) {
         TechnicianEntity obj=new TechnicianEntity();
		
		obj.setFirstname(technicianDTO.getFirstname());
		obj.setSecondname(technicianDTO.getSecondname());
		obj.setEmail(technicianDTO.getEmail());
		obj.setMobilenumber(technicianDTO.getMobilenumber());
		obj.setAadharnumber(technicianDTO.getAadharnumber());
		obj.setDescription(technicianDTO.getDescription());
		
		
		return obj;
	}


}

