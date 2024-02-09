package com.example.mapstruct.springmapstructdemo.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapstruct.springmapstructdemo.Dto.EmployeeDto;
import com.example.mapstruct.springmapstructdemo.Entity.Employee;
import com.example.mapstruct.springmapstructdemo.Repository.EmployeeInterface;

@Service 
public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeInterface employeeRepo;
	
	public Employee saveEmployee(EmployeeDto employeeDto)
	{
		return employeeRepo.saveEmployee(employeeDto);
		
	}
	

}
