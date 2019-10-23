package com.virtusa.HibernateDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {
	
	@Id
	private Integer passportId;
	private String personName;
	
	
	public Integer getPassportId() {
		return passportId;
	}
	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	

}
