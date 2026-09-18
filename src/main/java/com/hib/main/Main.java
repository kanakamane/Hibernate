package com.hib.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.Entity.Student;
import com.hib.Entity.StudentDetail;
import com.hib.Entity.Subject;
import com.hib.daoimpl.HibernateDAOImpl;

public class Main {

	public static void main(String[] args) {
		
		
		
		HibernateDAOImpl hibernateDAOImpl = new HibernateDAOImpl();
		
		
		Subject sb1 = new Subject("html", 10);
		Subject sb2 = new Subject("css", 20);
		Subject sb3 = new Subject("js", 30);
		Subject sb4 = new Subject("java", 40);
		Subject sb5 = new Subject("spring",50);
		Subject sb6 = new Subject("nodejs", 60);
		
		List<Subject> list1=new ArrayList<Subject>();
		
		list1.add(sb1);
		list1.add(sb2);
		list1.add(sb3);
		
		Student student = new Student("mahesh", "mahesh@email.com", "hebbal", 560094);
		
		StudentDetail studentDetail = new StudentDetail("87645", "bidarrr", "kar");
		
		student.setStudentdetail(studentDetail);
		
		studentDetail.setStudent(student);
		
		
		student.setSubjects(list1);
		
		
		sb1.setStudent(student);
		sb2.setStudent(student);
		sb3.setStudent(student);
		
		
		
		
		hibernateDAOImpl.insertStudent(student);
		
		
//		List<Student> slist = hibernateDAOImpl.fetchAll();
//		
//		
//		
//		for(Student s:slist) {
//			System.out.println(s);
//		}
//		
//		
//		
		
		
//		Student student = new Student("kanaka","kanaka@email","sanjaynagar",85412);
//		
//		StudentDetail studentDetail = new StudentDetail("45124612", "bidar", "karnataka");
//		
//		student.setStudentdetail(studentDetail);
//		
//		hibernateDAOImpl.insertStudent(student);
		
		
		
		
		
		//Student stu =new Student("sachin","sachin@gmail.com","hydrabad",560854);
		
		
		//hibernateDAOImpl.insertStudent(stu);
		
		
		
//		List<Student> slist = hibernateDAOImpl.fetchAll();
//		
//		for(Student s:slist) {
//			System.out.println(s);
//		}
		
//		
		
//		Student s = hibernateDAOImpl.fetchOne(2);
//		
//		System.out.println(s);
		
		
//		hibernateDAOImpl.delete(2);
		
//		hibernateDAOImpl.updateStudent("kanka@gmail.com",52);
		
		
	}

}
