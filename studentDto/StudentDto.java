package com.sysfore.studentjpa.studentDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
	private int id;
	private String name;
	private int age;
	private String email;
	private String phoneNo;
}
