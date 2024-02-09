package com.example.mapstruct.springmapstructdemo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
	
	private int id;
	
	private String name;
	
	private int age;
	
	private String email;
	
	private int projectid;

}
