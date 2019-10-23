package com.virtusa.HibernateDemo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	private Integer courseID;
	private String courseName;
	
	
	@ManyToMany
	@JoinTable(name="course_stud" , joinColumns= {@JoinColumn(name="courseId")} , inverseJoinColumns= {@JoinColumn(name="studentId")})
	private List<Student> studentList;
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(Integer courseID, String courseName) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
	}

	public Integer getCourseID() {
		return courseID;
	}
	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	

}
