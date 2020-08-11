package com.school.project.dao;

import java.util.List;
import java.util.Set;

import com.school.project.model.Teacher;

public interface TeacherDAO {

//	public void save(Teacher p);
	
	//public List<Person> list();
	public Set<Teacher> getAllTechers();
	public Teacher getTeacher(Integer id);
	
}