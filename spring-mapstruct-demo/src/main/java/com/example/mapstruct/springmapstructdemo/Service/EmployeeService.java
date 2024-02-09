package com.example.mapstruct.springmapstructdemo.Service;

import java.util.Date;
import java.util.List;

import com.example.mapstruct.springmapstructdemo.Entity.Employee;


public interface EmployeeService {
	
	
	    // Create employee
	    Employee createEmployee(String name, String email, Date creationdate, int age, Long creationId, Long projectId);
	    
	    // Update employee
	    Employee updateEmployee(Long id, String name, String email, Date creationdate, int age, Long creationId, Long projectId);
	    
	    // Delete employee by ID
	    void deleteEmployee(Long id);
	    
	    // Get employee by ID
	    Employee getEmployeeById(Long id);
	    
	    // Get all employees
	    List<Employee> getAllEmployees();
	    
	    // Get employees by project ID
	    List<Employee> getEmployeesByProjectId(Long projectId);
	    
	    Employee saveEmployee(Employee employee);
	    
	}



