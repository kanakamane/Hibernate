package com.hib.dao;

import java.util.List;

import com.hib.Entity.Student;

public interface HibernateDAO {
	
	void insertStudent(Student student);
	
	 List<Student> fetchAll();
	 
	 Student fetchOne(int sid);
	 
	 public void delete(int i);
	 
	 public void updateStudent(String string, int i) ;

}
