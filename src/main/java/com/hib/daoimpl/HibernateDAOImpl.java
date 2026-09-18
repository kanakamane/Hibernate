package com.hib.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hib.Entity.Student;
import com.hib.Entity.StudentDetail;
import com.hib.Entity.Subject;
import com.hib.dao.HibernateDAO;

public class HibernateDAOImpl implements HibernateDAO{
	
	
	Session session ;
	private Transaction t;
	public HibernateDAOImpl() {
		 session = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetail.class)
				.addAnnotatedClass(Subject.class)
				.buildSessionFactory()
				.openSession();
	}

	@Override
	public void insertStudent(Student student) {
		
		 t = session.beginTransaction();
		session.persist(student);
		t.commit();
		
		System.out.println("data inserted");
	}

	@Override
	public  List<Student> fetchAll() {
		
		 t = session.beginTransaction();
		 Query q = session.createQuery("from Student");
		 List<Student> slist = q.list();
		return slist;
	}

	@Override
	public Student fetchOne(int sid) {
		
		return session.get(Student.class,sid);
		
	}

	public void delete(int i) {
		
		Student fetchOne = fetchOne(i);
		
		 t = session.beginTransaction();
		 
		 if(fetchOne!=null) {
		
		session.delete(fetchOne);
		t.commit();
		System.out.println("deleted");
		 }
		 else {
			 System.out.println("student not found");
		 }
	}

	public void updateStudent(String email, int i) {
		
		Student student = session.get(Student.class, i);
		
		
		session.beginTransaction();
		
		if(student!=null) {
			student.setEmail(email);
			session.persist(student);
		}
		
		session.getTransaction().commit();
		
	}
}
