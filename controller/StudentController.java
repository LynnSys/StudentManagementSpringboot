package com.sysfore.studetjpa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sysfore.studentjpa.modal.Student;
import com.sysfore.studentjpa.service.StudentService;
import com.sysfore.studentjpa.studentDto.StudentDto;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService _service;
	
	@GetMapping("/GetEmployees")
	public ResponseEntity<List<Student>> GetEmployees(){
		return ResponseEntity.ok(_service.getAllStudents());
	}
	
	@PostMapping("/AddStudent")
	public ResponseEntity<Student> AddStudent(@RequestBody StudentDto st){
		return ResponseEntity.ok(_service.addStudent(st));
	}
	
	@PutMapping("/UpdateEmployee")
	public ResponseEntity<StudentDto> UpdateEmployee(@RequestBody StudentDto st){
			return ResponseEntity.ok(_service.updateStudent(st));
	}
}

