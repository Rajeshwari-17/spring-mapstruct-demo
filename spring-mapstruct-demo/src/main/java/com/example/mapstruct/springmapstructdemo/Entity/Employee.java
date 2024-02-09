package com.example.mapstruct.springmapstructdemo.Entity;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Emp")


public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String name;
	private int age;
	private String emiail;
	private int projectid;
	private Date creationdate;
	

}
