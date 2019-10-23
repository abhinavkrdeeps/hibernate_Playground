package com.virtusa.HibernateDemo.service;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.virtusa.HibernateDemo.model.Course;
import com.virtusa.HibernateDemo.model.Student;


public class CourseService {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = null;
		
		Course course = new Course();
		course.setCourseID(1009);
		course.setCourseName("C++");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Abhinav");
		studentList.add(student);
		Student student1 = new Student();
		student1.setStudentId(102);
		student1.setStudentName("Gaurav");
		studentList.add(student1);
		course.setStudentList(studentList);
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(course);
			session.getTransaction().commit();
			
		}finally {
			session.close();
		}
		
	}

}
