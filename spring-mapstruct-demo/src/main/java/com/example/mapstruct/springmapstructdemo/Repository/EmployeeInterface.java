package com.example.mapstruct.springmapstructdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapstruct.springmapstructdemo.Dto.EmployeeDto;
import com.example.mapstruct.springmapstructdemo.Entity.Employee;

@Repository
public interface EmployeeInterface extends JpaRepository<Employee,Integer>{

	Employee saveEmployee(EmployeeDto employeeDto);

}
