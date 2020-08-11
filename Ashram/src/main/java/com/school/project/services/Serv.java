package com.school.project.services;

import java.util.List;
import java.util.Set;

import com.school.project.model.Student;
import com.school.project.model.Teacher;

public interface Serv {
	//void saveStudent();
	public Set<Teacher> getAllTechers();
	public Teacher getTeacher(Integer id);
	public Long getStudentCount();
	Student getStudent(Integer rollNo);
}
