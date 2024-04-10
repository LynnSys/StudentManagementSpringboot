package com.sysfore.studentjpa.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="mark")
public class Marks {
	@Id
	int st_id;
	int mathMarks;
	int mark2;
	int mark3;
}
