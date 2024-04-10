package com.sysfore.studentjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sysfore.studentjpa.Repo.StudentRepo;
import com.sysfore.studentjpa.modal.Student;
import com.sysfore.studentjpa.studentDto.StudentDto;

@Service
public class StudentService{

	@Autowired
	private StudentRepo repo;
	@Autowired
	private StudentMapper mapper;

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students = repo.findAll();
		return students;
	}
	
	public StudentDto updateStudent(StudentDto s) {
		Student st = repo.findById(s.getId());
		if(st!=null) {
			st.setName(s.getName());
			st.setAge(s.getAge());
			st.setEmail(s.getEmail());
			st.setPhoneNo(s.getPhoneNo());
			st.setIsActive(1);
			repo.save(st);
		}
	}
		public Student addStudent(StudentDto s) {
		Student student = mapper.mapStudentDtoToStudent(s);
		//Student student = new Student(s);
		repo.save(student);
		return student;
	}
		
	
			
	}

}
