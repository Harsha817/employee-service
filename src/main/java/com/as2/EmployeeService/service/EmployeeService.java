package com.as2.EmployeeService.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as2.EmployeeService.db.entity.EmployeeEntity;
import com.as2.EmployeeService.db.repo.EmployeeRepo;





@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public String saveEmployee(EmployeeEntity employee) {
		repo.save(employee);
		return "Saved Successfully";
	}
	public List<EmployeeEntity> retrieveAll(){
		return repo.findAll();
	}
	public Optional<EmployeeEntity> retrieveById(String Id){
		return repo.findById(Id);
	}
	public void deleteById(String Id){
		repo.deleteById(Id);
	}
	
}
