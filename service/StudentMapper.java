package com.sysfore.studentjpa.service;

import org.springframework.stereotype.Service;

import com.sysfore.studentjpa.modal.Student;
import com.sysfore.studentjpa.studentDto.StudentDto;

@Service
public class StudentMapper {


	public Student mapStudentDtoToStudent(StudentDto s) {
		// TODO Auto-generated method stub
		Student st= new Student(s);
		return st;
	}

}
