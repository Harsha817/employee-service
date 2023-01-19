package com.as2.EmployeeService.db.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;


import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@Document
public class EmployeeEntity {
	@Id
	private String id;
	private String name;
	private String deptName;
	private String address;
	private Date joiningDate;
	private Number salary;
	
	
	public EmployeeEntity() {
		
	}

	public EmployeeEntity(EmployeeBuilder employeeBuilder) {
		this.id = id;
		this.name = name;
		this.deptName = deptName;
		this.address = address;
		this.joiningDate = joiningDate;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getAddress() {
		return address;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public Number getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptName=" + deptName + ", address=" + address
				+ ", joiningDate=" + joiningDate + ", salary=" + salary + "]";
	}

@JsonPOJOBuilder(withPrefix = "set")
public static class EmployeeBuilder {
	private String id;
	private String name;
	private String deptName;
	private String address;
	private Date joiningDate;
	private Number salary;
	
	public EmployeeBuilder setId(String id) {
		this.id = id;
		return this;
	}
	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public EmployeeBuilder setDeptName(String deptName) {
		this.deptName = deptName;
		return this;
	}
	public EmployeeBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	public EmployeeBuilder setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
		return this;
	}
	public EmployeeBuilder setSalary(Number salary) {
		this.salary = salary;
		return this;
	}
	
	public EmployeeEntity getEmployee() {
		return new EmployeeEntity(this); 
		
	}
}
}
