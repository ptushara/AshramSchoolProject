package com.school.project.dao;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.school.project.model.Teacher;

@Repository
public class TeacherDAOImpl extends BaseDaoImpl implements TeacherDAO {
    
	/*public void save(Teacher p) {
		Session s=currentSession();
		s.persist(p);
		
	}*/

	@Override
	public Set<Teacher> getAllTechers() {
		Session session=currentSession();
		//criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Teacher> query = builder.createQuery(Teacher.class);
		Root<Teacher> root = query.from(Teacher.class);
		query.select(root);
		Query<Teacher> q = session.createQuery(query);
		Set<Teacher>  teacherList = new LinkedHashSet(q.getResultList());
		return teacherList;
		
	}

	@Override
	public Teacher getTeacher(Integer id) {
		// TODO Auto-generated method stub
		Session session=currentSession();
		Teacher teacherList= session.load(Teacher.class, id);
		return teacherList;
	}

	

}