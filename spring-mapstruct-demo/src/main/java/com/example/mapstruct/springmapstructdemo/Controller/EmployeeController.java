package com.example.mapstruct.springmapstructdemo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapstruct.springmapstructdemo.Dto.EmployeeDto;
import com.example.mapstruct.springmapstructdemo.Entity.Employee;
import com.example.mapstruct.springmapstructdemo.Service.Impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto)
	{
		return new ResponseEntity<>(EmployeeServiceImpl.saveEmployee(employeeDto),HttpStatus.CREATED);
	}
}
