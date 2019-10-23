package com.virtusa.HibernateDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.virtusa.HibernateDemo.model.Address;
import com.virtusa.HibernateDemo.model.Course;
import com.virtusa.HibernateDemo.model.Passport;
import com.virtusa.HibernateDemo.model.Student;
import com.virtusa.HibernateDemo.model.Vehicle;

public class StudService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Abhinav");
		Session session = null;
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		SessionFactory sessionFactory1 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Passport.class).buildSessionFactory();	

		Integer count = 0;
		Passport passport = new Passport();
		passport.setPassportId(1234);
		passport.setPersonName("abhinav");
		
		student.setPassport(passport);
		
		Address addr=new Address(21,"Park Stret");
		Address addr2=new Address(25,"Oak Street");
		List<Address> al=new ArrayList<Address>();
		al.add(addr);
		al.add(addr2);
		student.setAddressList(al);
		
		List<Course> courseList = new ArrayList<Course>();
		
		Course course1 = new Course(12,"Java");
		Course course2 = new Course(123,"C++");
		courseList.add(course1);
		courseList.add(course2);
		student.setCourseList(courseList);
		
		
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	    Vehicle vehicle1 = new Vehicle();
	    vehicle1.setVehicleId(101);
	    vehicle1.setVehicleName("Bugati");
	    Vehicle vehicle2 = new Vehicle();
	    vehicle2.setVehicleId(102);
	    vehicle2.setVehicleName("BMW");
	    vehicleList.add(vehicle1);
	    vehicleList.add(vehicle2);
	    
	    student.setVehicleList(vehicleList);
	    
	//	student.setAddress(address);
		try {
			
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(passport);
			session.save(student);
			
			session.getTransaction().commit();
			
			
		}finally {
			session.close();

		}

	}

}
