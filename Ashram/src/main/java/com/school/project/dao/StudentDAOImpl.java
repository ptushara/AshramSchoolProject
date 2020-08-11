package com.school.project.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.school.project.dao.BaseDaoImpl;
import com.school.project.dao.StudentDAO;
import com.school.project.model.Student;

@Repository
public class StudentDAOImpl  extends BaseDaoImpl implements StudentDAO {

	@Override
	public Long getStudentCount() {
		Session session= currentSession();
		return (Long) session.createQuery("select count(s) from Student s").getSingleResult();
	}

	@Override
	public Student getStudent(Integer rollNo) {
		Session session= currentSession();
		return session.load(Student.class, rollNo);
	}

}
