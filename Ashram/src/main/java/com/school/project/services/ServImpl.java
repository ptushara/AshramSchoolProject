package com.school.project.services;



import java.awt.List;
import java.util.Base64;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.dao.StudentDAO;
import com.school.project.dao.TeacherDAO;
import com.school.project.model.Student;
import com.school.project.model.Teacher;

@Service
public class ServImpl implements Serv {

	@Autowired
	private TeacherDAO teacherDAO;
	
	@Autowired
	private StudentDAO studentDAO;
	/*@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void saveStudent() {
		
		Teacher teacher=new Teacher();
		teacher.setTeacherId(1);
		teacher.setFullname("Harish Chandra");
		teacher.setEmail("harishchandra@gmail.com");
		teacherDAO.save(teacher);
		
		
	}*/

	@Override
	public Set<Teacher> getAllTechers() {
		// TODO Auto-generated method stub
		
		Set<Teacher> teachersList=teacherDAO.getAllTechers();
		teachersList.stream().forEach(t->{
			t.setProfileString(Base64.getEncoder().encodeToString(t.getProfilePic()));
			t.getStudents().stream().forEach(s->{
				s.setProfileString(Base64.getEncoder().encodeToString(s.getProfiPic()));
			});
		});
		return teachersList;
	}

	@Override
	public Teacher getTeacher(Integer id) {
		// TODO Auto-generated method stub
		
		return teacherDAO.getTeacher(id);
	}

	@Override
	public Long getStudentCount() {
		// TODO Auto-generated method stub
		return studentDAO.getStudentCount();
	}

	@Override
	public Student getStudent(Integer rollNo) {
		return studentDAO.getStudent(rollNo);
	}

}
