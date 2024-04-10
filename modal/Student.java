package com.sysfore.studentjpa.modal;



import com.sysfore.studentjpa.studentDto.StudentDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String name;
	private int age;
	private String email;
	private String phoneNo;
	public int isActive;
	public Student(StudentDto s)
	{
		this.id = s.getId();
		this.name = s.getName();
		this.age = s.getAge();
		this.email=s.getEmail();
		this.phoneNo = s.getPhoneNo();
		this.isActive = 1;
	}
}
