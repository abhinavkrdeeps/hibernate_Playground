package com.virtusa.HibernateDemo.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private Integer StudentId;
	private String StudentName;
	

	@ElementCollection
	@CollectionTable(name="student_addresslist" , joinColumns= @JoinColumn(name="studentId"))
	@Column(name="stud_address")
	private List<Address> addressList;
	
	@OneToOne
	private Passport passport;
	
	
	@ManyToMany
	@JoinTable(name="student_course" , joinColumns= {@JoinColumn(name="studentId")}, inverseJoinColumns= {@JoinColumn(name="courseId")})
	private List<Course> courseList;
	
	
	@OneToMany
	@JoinTable(name="student_vehicle",joinColumns= {@JoinColumn(name="studentId")}, inverseJoinColumns= {@JoinColumn(name="vehicleId")})
	private List<Vehicle> vehicleList;
	
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public Integer getStudentId() {
		return StudentId;
	}
	public void setStudentId(Integer studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}
	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}
	
	
	
}
