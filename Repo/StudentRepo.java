package com.sysfore.studentjpa.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sysfore.studentjpa.modal.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	public Student findById(Integer id);
}
