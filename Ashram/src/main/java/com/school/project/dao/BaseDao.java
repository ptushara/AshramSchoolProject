package com.school.project.dao;

public interface BaseDao {

	
	public <T> T save(final T o);
	
	public <T> void saveOrUpdate(final T o) ;
	
	
}
