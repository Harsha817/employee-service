package com.as2.EmployeeService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.as2.EmployeeService.db.entity.EmployeeEntity;
import com.as2.EmployeeService.service.EmployeeService;

import java.util.Optional;



@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmp")
	@ResponseStatus(HttpStatus.CREATED)
	public String saveEmployee(@RequestBody EmployeeEntity employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/Allemp")
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeEntity> retrieveAll() {
        return employeeService.retrieveAll();
    }
	
	 @GetMapping("/{empId}")
	 public Optional<EmployeeEntity> retrieveById(@PathVariable("empId") String id) {
	        return employeeService.retrieveById(id);
	 }
	 
	 
	 @PutMapping("/updateEmployee/{empId}")
	 public String updateEmployee(@PathVariable("empId") String id,@RequestBody EmployeeEntity employee) {
	        Optional<EmployeeEntity> emp = employeeService.retrieveById(id);
	        if (emp.isPresent()) {
	            return employeeService.saveEmployee(employee);
	        }
	        return "unable to update";
	    }
	 
	 @DeleteMapping("/deleteEmployee/{empId}")
	    public void deleteEmployee(@PathVariable("empId") String id) {
	        employeeService.deleteById(id);
	    }
	
	
	
}