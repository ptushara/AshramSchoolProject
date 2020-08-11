package com.school.project.dao;

import com.school.project.model.Student;

public interface StudentDAO {	
	Long getStudentCount();
	Student getStudent(Integer rollNo);
}
